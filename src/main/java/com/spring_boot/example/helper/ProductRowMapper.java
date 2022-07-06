package com.spring_boot.example.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring_boot.example.entities.Product;

public class ProductRowMapper  implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Product p = new Product();
		p.setProductId(rs.getInt("productId"));
		p.setProductName(rs.getString("productName"));
		p.setProductDesc(rs.getString("productDesc"));
		p.setProductPrice(rs.getDouble("productPrice"));
		p.setStock(rs.getBoolean("stock"));
		
		return p;
	}

}
