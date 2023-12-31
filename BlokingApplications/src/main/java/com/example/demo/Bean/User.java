
package com.example.demo.Bean;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	   private Long id;
	   
	@Column(unique = true)
	   private String userName;
	   
	   private String firstName;
	   
	   private String lastName;
	   
	   private String password;
	   @Column(unique = true)   
	   private String email;
	   
	   @OneToOne(cascade = CascadeType.ALL)
	   private Address address;
	   
	   private String phoneNo;
	   
	   private String website;
	   

	@OneToMany(cascade = CascadeType.ALL)
	   @JoinColumn(name="u_id")
      @JsonManagedReference
      @EqualsAndHashCode.Exclude
	   private Set<UserRoles> userRoles;
	   
	   @ManyToOne
	   @JoinColumn(name = "c_id")
	   @JsonIgnoreProperties(value = {"users"})
	   private Companey company;
	   
	   @OneToMany(cascade = CascadeType.ALL)
	   @JoinColumn(name="u_id")
	   @JsonIgnoreProperties("user")
	   private List<Posts> posts;
	   
	   @OneToMany(cascade = CascadeType.ALL)
	   @JoinColumn(name="u_id")
	   @JsonIgnoreProperties(value = {"user"})
	   private List<Album> albums;
	   
	   @CreationTimestamp
	   private Timestamp createdAt;
	   
	   @UpdateTimestamp
	   private Timestamp updatedAt;
	   	
	  
}



