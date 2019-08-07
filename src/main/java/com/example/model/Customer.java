package com.example.model;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Customer implements Serializable {
  private static final long serialVersionUID = 3868269731826822792L;

  @Id
  @GeneratedValue
  private UUID id;
  @Column
  private String name;
  @Version
  private Long version;

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Long getVersion() {
    return version;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setVersion(Long version) {
    this.version = version;
  }
}
