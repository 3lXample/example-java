package com.example.service;

import java.util.List;
import java.util.UUID;
import com.example.model.Episode;
import com.example.model.Series;

public interface SeriesService {

  List<Series> findAllHot();

  List<Series> findAllTrending();

  Episode findEpisodeById(UUID episodeId);
}
