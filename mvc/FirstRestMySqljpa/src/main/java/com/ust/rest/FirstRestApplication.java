package com.ust.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.resorce.Product;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
public class FirstRestApplication implements CommandLineRunner {
	
	@Autowired
	ProductRepository repo;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext txt=
		SpringApplication.run(FirstRestApplication.class, args);
		for(String str:args) {
			System.out.println(str);
		}
		boolean found=txt.containsBean("productRepository");
		System.out.println(found);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("from commanLineRunnner");
		
		List<Product> products=repo.findAll();
		System.out.println(products.size());
	}

}
