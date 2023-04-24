package com.ust.rest.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.resorce.Product;

@Service
public class Productservice {
	@Autowired
	ProductRepository repository;
	
	public Product getProduct(long productId) {
		return repository.getProduct( productId);
	}

	public ArrayList<Product> getProducts() {
		// TODO Auto-generated method stub
		return repository.getProducts();
	}
	
	public boolean add(Product product) {
		return repository.addProduct(product);
	}
	
	public Product updateProduct(Product product) {
		return repository.updateProduct(product);
	}
	public void detetProduct(long productId) {
		repository.delete(productId);
	}

}
