package com.adda.dollop.Bean;
import java.sql.Timestamp;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Todos {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   
   private String title;
   
   private Boolean completed=false;
   
   @ManyToOne
   private User user;
   
	@CreationTimestamp
	private Timestamp createdAt;
	
	@UpdateTimestamp
	private Timestamp updatedAt;	
	
	private Long createdBy;
	private Long updatedBy;

}
