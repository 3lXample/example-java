package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.dto.SeriesDto;
import com.example.dto.WatchingDto;
import com.example.dto.WatchingStatus;
import com.example.model.Customer;
import com.example.model.CustomerWatch;
import com.example.model.Episode;
import com.example.model.Series;
import com.example.model.WatchStatus;
import com.example.service.AuthService;
import com.example.service.CustomerService;
import com.example.service.SeriesService;

@RestController
@RequestMapping("/")
public class HomeController {

  @Autowired
  private AuthService authService;
  @Autowired
  private SeriesService seriesService;
  @Autowired
  private CustomerService customerService;

  @RequestMapping("hot-series")
  public List<SeriesDto> hotSeries() {
    authService.validateAuth();
    List<SeriesDto> response = new ArrayList<>();
    List<Series> hotSeries = seriesService.findAllHot();
    hotSeries.forEach(series -> {
      SeriesDto seriesDto = new SeriesDto();
      seriesDto.setId(series.getId());
      seriesDto.setCode(series.getCode());
      seriesDto.setTitle(series.getTitle());
      seriesDto.setStatus(series.getStatus());
      seriesDto.setHot(series.isHot());
      seriesDto.setTrending(series.isTrending());
      response.add(seriesDto);
    });
    return response;
  }

  @RequestMapping("trending-series")
  public List<SeriesDto> trendingSeries() {
    authService.validateAuth();
    List<SeriesDto> response = new ArrayList<>();
    List<Series> hotSeries = seriesService.findAllTrending();
    hotSeries.forEach(series -> {
      SeriesDto seriesDto = new SeriesDto();
      seriesDto.setId(series.getId());
      seriesDto.setCode(series.getCode());
      seriesDto.setTitle(series.getTitle());
      seriesDto.setStatus(series.getStatus());
      seriesDto.setHot(series.isHot());
      seriesDto.setTrending(series.isTrending());
      response.add(seriesDto);
    });
    return response;
  }

  @RequestMapping("watching-series")
  public List<WatchingDto> watchingSeries() {
    Customer customer = authService.getLoggedInCustomer();
    List<WatchingDto> response = new ArrayList<>();
    List<CustomerWatch> customerWatchs = customerService.findAllWatching(customer.getId());
    customerWatchs.forEach(customerWatch -> {
      Series series = customerWatch.getSeries();
      Episode episode = customerWatch.getEpisode();
      WatchingStatus status = WatchingStatus.WAIT_NEXT_EPISODE;
      Long timeStop = 0L;
      if (customerWatch.getStatus() == WatchStatus.WATCHING) {
        status = WatchingStatus.RESUME;
        timeStop = customerWatch.getTimeStop();
      } else if (customerWatch.getStatus() == WatchStatus.FINISHED) {
        if (episode.getNextEps() != null) {
          episode = seriesService.findEpisodeById(episode.getNextEps());
          status = WatchingStatus.NEXT_EPISODE;
        }
      }

      if (status != WatchingStatus.WAIT_NEXT_EPISODE) {
        WatchingDto watching = new WatchingDto();
        watching.setId(customerWatch.getId());
        watching.setSeriesId(series.getId());
        watching.setSeriesCode(series.getCode());
        watching.setSeriesTitle(series.getTitle());
        watching.setSeriesStatus(series.getStatus());
        watching.setEpisodeId(episode.getId());
        watching.setEpisodeNumber(episode.getNumber());
        watching.setEpisodeDuration(episode.getDuration());
        watching.setStatus(status);
        watching.setTimeStop(timeStop);
        response.add(watching);
      }
    });
    return response;
  }
}
