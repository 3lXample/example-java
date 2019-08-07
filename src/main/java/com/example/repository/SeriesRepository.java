package com.example.repository;

import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.model.Series;

@Repository
public interface SeriesRepository extends CrudRepository<Series, UUID> {
  List<Series> findByHotIsTrue();

  List<Series> findByTrendingIsTrue();
}
