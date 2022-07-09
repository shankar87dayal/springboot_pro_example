package com.spring_boot.example.repo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.spring_boot.example.entities.Product;
import com.spring_boot.example.repo.ProductRepository;
import com.spring_boot.example.service.ProductService;

@Service

public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		Product saved = productRepository.save(product);
		return saved;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> list = productRepository.findAll();
		return list;
	}

	@Override
	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		Product product = productRepository.findById(productId).get();
		return product;
	}

	@Override
	public Product updateProduct(Product newProduct, int productId) {
		// TODO Auto-generated method stub
		
		Product product = productRepository.findById(productId).get();
		
		product.setProductName(newProduct.getProductName());
		product.setProductDesc(newProduct.getProductDesc());
		product.setProductPrice(newProduct.getProductPrice());
		product.setStock(newProduct.isStock());
		
		Product updated = productRepository.save(product);
		return updated;
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		Product product = productRepository.findById(productId).get();
		productRepository.delete(product);
		
	}

}
