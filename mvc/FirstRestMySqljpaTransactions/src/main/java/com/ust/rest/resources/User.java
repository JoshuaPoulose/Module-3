package com.ust.rest.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Product_User")
public class User {
	@Id
	@GeneratedValue
	private long userId;
	private String dateTime;
	
	
	

}
