package com.spring_boot.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.spring_boot.example.entities.Product;

@Component
public class ProductService {

	List<Product> list = new ArrayList<>();
	
	// creating a product
	public Product createProduct( Product product)
	{
		System.out.println(product.getProductName());
		
		list.add(product);
		return product;
	}
	
	//get All product
	
	public List<Product> getAllProducts()
	{
		return list;
	}
}
