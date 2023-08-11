package com.example.demo.Bean;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Geo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
	
	private String lat;
	
	private String lng;
	
private Timestamp createdAt;

private Timestamp updatedAt;	

private Long createdBy;
private Long updatedBy;

}

