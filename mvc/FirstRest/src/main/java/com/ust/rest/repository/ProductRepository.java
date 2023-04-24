package com.ust.rest.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Repository;

import com.ust.rest.resorce.Product;

@Repository
public class ProductRepository {
	private ArrayList<Product> productCache=new ArrayList<>();
	
	public  ProductRepository() {
		Product p1=new Product();
		p1.setProductId(101);
		p1.setName("Laptop");
		p1.setDescription("macbook retina eye");
		p1.setPrice(new BigDecimal(170000));
		p1.setQty(5);
		productCache.add(p1);
		
		Product p2=new Product();
		p2.setProductId(102);
		p2.setName("Tabletp");
		p2.setDescription("smaasung max view");
		p2.setPrice(new BigDecimal(890000));
		p2.setQty(10);
		productCache.add(p2);
		
		Product p3=new Product();
		p3.setProductId(103);
		p3.setName("Mobile");
		p3.setDescription("iPhone 15");
		p3.setPrice(new BigDecimal(100000));
		p3.setQty(7);
		productCache.add(p3);
		
		Product p4=new Product();
		p4.setProductId(104);
		p4.setName("Telivision");
		p4.setDescription("LG");
		p4.setPrice(new BigDecimal(290000));
		p4.setQty(8);
		productCache.add(p4);
		
		Product p5=new Product();
		p5.setProductId(105);
		p5.setName("AC");
		p5.setDescription("Llyod");
		p5.setPrice(new BigDecimal(140000));
		p5.setQty(6);
		productCache.add(p5);
		
		//create
	}
	public boolean addProduct(Product product) {
		if(productCache.add(product)) {
			return true;
		}
		else
			return false;
	}
	//retrieve
	public Product getProduct(long productId) {
		Iterator<Product>iter=productCache.iterator();
		Product product=null;
		while(iter.hasNext()) {
			product=iter.next();
			if(product.getProductId()==productId)
				break;
		}
		if(product!=null)
			return product;
		else
			return null;
	}
	public ArrayList<Product>getProducts(){
		return productCache;
	}
	
	public Product updateProduct(Product productUpdate) {
		Product searchProduct=null;
		Iterator<Product>iter=productCache.iterator();
		int index=0;
		while(iter.hasNext()) {
			searchProduct=iter.next();
			if(searchProduct.getProductId()==productUpdate.getProductId()) {
				productCache.add(index,productUpdate);
				productUpdate=searchProduct;
			}
			index++;
		}
		return productUpdate;
	}
	public void delete(long productId) {
		Iterator<Product> iter=productCache.iterator();
		int index=0;
		while(iter.hasNext()) {
			Product tempProduct=iter.next();
			if(tempProduct.getProductId()==productId) {
				break;
			}
			index++;
		}productCache.remove(index);
	}

}
