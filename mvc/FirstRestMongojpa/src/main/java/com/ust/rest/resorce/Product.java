package com.ust.rest.resorce;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Entity
@Data
@Document
@NoArgsConstructor
@AllArgsConstructor

public class Product {	
	@Id
//	@GeneratedValue	(strategy=GenerationType.IDENTITY)
	//AUTO is default generation type. when a statergy is not specified JPA uses auto
	//when the underline database is mySQL generationType.Auto means
	//the JPA will create a hibernate sequence in the database for
	// generation of primary keys
	
	
//	select next_val as id_val from hibernate_sequence for update
//	Hibernate: update hibernate_sequence set next_val= ? where next_val=?
//	Hibernate: insert into product (description, name, price, qty, product_id) values (?, ?, ?, ?, ?)
	private String _Id;	
	private String name;
	private String description;	
	private BigDecimal price;	
	private int qty;
	
	

}
