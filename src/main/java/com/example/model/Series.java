package com.example.model;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Series implements Serializable {
  private static final long serialVersionUID = 6819971439069802857L;

  @Id
  @GeneratedValue
  private UUID id;
  @Column
  private String code;
  @Column
  private String title;
  @Column
  @Enumerated(EnumType.STRING)
  private SeriesStatus status;
  @Column
  private boolean hot;
  @Column
  private boolean trending;
  @Version
  private Long version;

  public String getCode() {
    return code;
  }

  public UUID getId() {
    return id;
  }

  public SeriesStatus getStatus() {
    return status;
  }

  public String getTitle() {
    return title;
  }

  public Long getVersion() {
    return version;
  }

  public boolean isHot() {
    return hot;
  }

  public boolean isTrending() {
    return trending;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setHot(boolean hot) {
    this.hot = hot;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public void setStatus(SeriesStatus status) {
    this.status = status;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setTrending(boolean trending) {
    this.trending = trending;
  }

  public void setVersion(Long version) {
    this.version = version;
  }
}
