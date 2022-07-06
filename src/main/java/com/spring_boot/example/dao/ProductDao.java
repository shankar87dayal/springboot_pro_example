package com.spring_boot.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring_boot.example.entities.Product;
import com.spring_boot.example.helper.ProductRowMapper;

@Repository
public class ProductDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//create product from db
	
	public Product createProduct( Product p) {
		
		String query = "insert into products(productId,productName,productDesc,productPrice,stock) value(?,?,?,?,?)";
		int update = jdbcTemplate.update(query, p.getProductId(),p.getProductName(),p.getProductDesc(),p.getProductPrice(),p.isStock());
		
		System.out.println(update + "row created");
		return p;
	}
	
	//get all product form db
	public List<Product> getAllProducts()
	{
		String query = "select * from products";
		List<Product> products = jdbcTemplate.query(query, new ProductRowMapper());
		return products;
		
	}
	
	//get single product form db
	
	public Product getProduct(int productId)
	{
		String query = "select * from products where productId=?";
		 Product productfromdb = jdbcTemplate.queryForObject(query, new ProductRowMapper(), productId);
		
		return productfromdb;
	}

	//update product form db
	public Product updateProduct(Product p, int productId)
	{
		String query = "update products set productName =?,productDesc=?,productPrice=?,stock=? where productId=?";
		
		int update = jdbcTemplate.update(query, p.getProductName(),p.getProductDesc(),p.getProductPrice(),p.isStock(),productId);
		
		p.setProductId(productId);
		return p;
	}
	
	//delete product form db
	public void deleteProduct(int productId)
	{
		String query = "delete from products where productId=?";
		int deleted = jdbcTemplate.update(query, productId);
		System.out.println(deleted + "row deleted");
	}
}


 













