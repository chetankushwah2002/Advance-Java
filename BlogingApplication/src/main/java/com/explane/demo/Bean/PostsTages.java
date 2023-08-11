package com.explane.demo.Bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class PostsTages {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @ManyToOne
  private Posts post;
  @ManyToOne
  private Tag tag;
}
