package com.example.dto;

import java.io.Serializable;
import java.util.UUID;
import com.example.model.SeriesStatus;

public class SeriesDto implements Serializable {
  private static final long serialVersionUID = -2414643186402876052L;

  private UUID id;
  private String code;
  private String title;
  private SeriesStatus status;
  private boolean hot;
  private boolean trending;

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
}
