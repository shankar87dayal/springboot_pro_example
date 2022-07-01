package com.spring_boot.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
	
	
	//get single product
	
	public Product getProduct(int productId) {
		
		Product product = list.stream().filter(p->p.getProductId()==productId).findFirst().get();
		System.out.println(product.getProductName());
		return product;
	}	
	
	//update product
	public Product updateProduct(Product newProduct, int productId)
	{
		List<Product> updatedList = list.stream().map(p->
		{
			if(p.getProductId()==productId)
			{
				p.setProductName(newProduct.getProductName());
				p.setProductDesc(newProduct.getProductDesc());
				p.setProductPrice(newProduct.getProductPrice());
				p.setStock(newProduct.isStock());
				
				return p;
			}else
			{
				return p;
			}
			
			
		}).collect(Collectors.toList());
		
		list =updatedList;
		newProduct.setProductId(productId);
		return newProduct;
	}
	
	
	//delete product
	public void deleteProduct(int productId)
	{
		List<Product> newList = list.stream().filter(p->p.getProductId()!=productId).collect(Collectors.toList());
		list=newList;
	}
}
