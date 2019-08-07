package com.example.repository;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.model.Episode;

@Repository
public interface EpisodeRepository extends CrudRepository<Episode, UUID> {

}
