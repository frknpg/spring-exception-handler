package com.bafoly.ex.article;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Article {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String content;
  
}
