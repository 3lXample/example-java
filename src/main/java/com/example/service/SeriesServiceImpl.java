package com.example.service;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.model.Episode;
import com.example.model.Series;
import com.example.repository.EpisodeRepository;
import com.example.repository.SeriesRepository;

@Service
@Transactional
public class SeriesServiceImpl implements SeriesService {
  @Autowired
  private SeriesRepository seriesRepository;
  @Autowired
  private EpisodeRepository episodeRepository;

  @Override
  public List<Series> findAllHot() {
    return seriesRepository.findByHotIsTrue();
  }

  @Override
  public List<Series> findAllTrending() {
    return seriesRepository.findByTrendingIsTrue();
  }

  @Override
  public Episode findEpisodeById(UUID episodeId) {
    return episodeRepository.findById(episodeId).get();
  }
}
