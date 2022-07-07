package com.spring_boot.example.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring_boot.example.entities.Category;

public class CategoryRowMapper implements RowMapper<Category>{

	@Override
	public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Category c =new Category();
		c.setCategoryId(rs.getInt("categoryId"));
		c.setTitle(rs.getString("title"));
		c.setCategoryDesc(rs.getString("categoryDesc"));
		return c;
	}
	

}
