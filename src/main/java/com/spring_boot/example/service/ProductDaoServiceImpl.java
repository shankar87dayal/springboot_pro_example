package com.spring_boot.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.spring_boot.example.dao.ProductDao;
import com.spring_boot.example.entities.Product;

@Service
@Primary
public class ProductDaoServiceImpl  implements ProductService{
	
	@Autowired
	private ProductDao productDao;

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.createProduct(product);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}

	@Override
	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		return productDao.getProduct(productId);
	}

	@Override
	public Product updateProduct(Product newProduct, int productId) {
		// TODO Auto-generated method stub
		return productDao.updateProduct(newProduct, productId);
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		productDao.deleteProduct(productId);
		
	}

}
