package com.example.model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class CustomerWatch implements Serializable {
  private static final long serialVersionUID = 9056858229033909768L;

  @Id
  @GeneratedValue
  private UUID id;
  @ManyToOne
  @JoinColumn(name = "customer_id")
  private Customer customer;
  @ManyToOne
  @JoinColumn(name = "series_id")
  private Series series;
  @ManyToOne
  @JoinColumn(name = "episode_id")
  private Episode episode;
  @Column
  @Enumerated(EnumType.STRING)
  private WatchStatus status;
  @Column(name = "time_stop")
  private Long timeStop;
  @Column(name = "updated_date")
  private Date updatedDate;
  @Version
  private Long version;

  public Customer getCustomer() {
    return customer;
  }

  public Episode getEpisode() {
    return episode;
  }

  public UUID getId() {
    return id;
  }

  public Series getSeries() {
    return series;
  }

  public WatchStatus getStatus() {
    return status;
  }

  public Long getTimeStop() {
    return timeStop;
  }

  public Date getUpdatedDate() {
    return updatedDate;
  }

  public Long getVersion() {
    return version;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public void setEpisode(Episode episode) {
    this.episode = episode;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public void setSeries(Series series) {
    this.series = series;
  }

  public void setStatus(WatchStatus status) {
    this.status = status;
  }

  public void setTimeStop(Long timeStop) {
    this.timeStop = timeStop;
  }

  public void setUpdatedDate(Date updatedDate) {
    this.updatedDate = updatedDate;
  }

  public void setVersion(Long version) {
    this.version = version;
  }
}
