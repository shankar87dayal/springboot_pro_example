package com.spring_boot.example.service;

/**
 * 
 * 
 * This method create a new product
 * 
 * @since 1.0
 * @see com.example.ProductController
 * @see com.spring_boot.example.serviceimpl
 * 
 * @param product
 * @return Product
 */

import java.util.List;

import com.spring_boot.example.entities.Product;


public interface ProductService {

	public Product createProduct( Product product);
	
	public List<Product> getAllProducts();
	
	public Product getProduct(int productId);
	
	public Product updateProduct(Product newProduct, int productId);
	
	public void deleteProduct(int productId);
	
}
