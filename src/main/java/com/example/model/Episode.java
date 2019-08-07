package com.example.model;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class Episode implements Serializable {
  private static final long serialVersionUID = -999992399288531385L;

  @Id
  @GeneratedValue
  private UUID id;
  @ManyToOne
  @JoinColumn(name = "series_id")
  private Series series;
  @Column
  private String number;
  @Column
  private Long duration;
  @Column(name = "prev_eps")
  private UUID prevEps;
  @Column(name = "next_eps")
  private UUID nextEps;
  @Version
  private Long version;

  public Long getDuration() {
    return duration;
  }

  public UUID getId() {
    return id;
  }

  public UUID getNextEps() {
    return nextEps;
  }

  public String getNumber() {
    return number;
  }

  public UUID getPrevEps() {
    return prevEps;
  }

  public Series getSeries() {
    return series;
  }

  public Long getVersion() {
    return version;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public void setNextEps(UUID nextEps) {
    this.nextEps = nextEps;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public void setPrevEps(UUID prevEps) {
    this.prevEps = prevEps;
  }

  public void setSeries(Series series) {
    this.series = series;
  }

  public void setVersion(Long version) {
    this.version = version;
  }
}
