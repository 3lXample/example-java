package com.example.dto;

import java.io.Serializable;
import java.util.UUID;
import com.example.model.SeriesStatus;

public class WatchingDto implements Serializable {
  private static final long serialVersionUID = -5448370054575951232L;

  private UUID id;
  private UUID SeriesId;
  private String SeriesCode;
  private String SeriesTitle;
  private SeriesStatus SeriesStatus;
  private UUID EpisodeId;
  private String EpisodeNumber;
  private Long EpisodeDuration;
  private WatchingStatus status;
  private Long timeStop;

  public Long getEpisodeDuration() {
    return EpisodeDuration;
  }

  public UUID getEpisodeId() {
    return EpisodeId;
  }

  public String getEpisodeNumber() {
    return EpisodeNumber;
  }

  public UUID getId() {
    return id;
  }

  public String getSeriesCode() {
    return SeriesCode;
  }

  public UUID getSeriesId() {
    return SeriesId;
  }

  public SeriesStatus getSeriesStatus() {
    return SeriesStatus;
  }

  public String getSeriesTitle() {
    return SeriesTitle;
  }

  public WatchingStatus getStatus() {
    return status;
  }

  public Long getTimeStop() {
    return timeStop;
  }

  public void setEpisodeDuration(Long episodeDuration) {
    EpisodeDuration = episodeDuration;
  }

  public void setEpisodeId(UUID episodeId) {
    EpisodeId = episodeId;
  }

  public void setEpisodeNumber(String episodeNumber) {
    EpisodeNumber = episodeNumber;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public void setSeriesCode(String seriesCode) {
    SeriesCode = seriesCode;
  }

  public void setSeriesId(UUID seriesId) {
    SeriesId = seriesId;
  }

  public void setSeriesStatus(SeriesStatus seriesStatus) {
    SeriesStatus = seriesStatus;
  }

  public void setSeriesTitle(String seriesTitle) {
    SeriesTitle = seriesTitle;
  }

  public void setStatus(WatchingStatus status) {
    this.status = status;
  }

  public void setTimeStop(Long timeStop) {
    this.timeStop = timeStop;
  }
}
