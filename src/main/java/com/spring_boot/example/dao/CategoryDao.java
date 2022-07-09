//package com.spring_boot.example.dao;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import com.spring_boot.example.entities.Category;
//import com.spring_boot.example.helper.CategoryRowMapper;
//
//@Repository
//public class CategoryDao {
//
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//	
//	//create new category from db
//	
//	public Category createCategory(Category category) {
//		
//		String query = "insert into categories(categoryId,title,categoryDesc) value(?,?,?)";
//		int update = jdbcTemplate.update(query,category.getCategoryId(),category.getTitle(),category.getCategoryDesc());
//		System.out.println(update +"row created");
//		return category;
//		
//	}
//	
//	//get all category from db
//	public List<Category> getAllCategory()
//	{
//		String query = "select * from categories";
//		List<Category> categories = jdbcTemplate.query(query, new CategoryRowMapper());
//		return categories;
//	}
//	
//	//get single category from db
//	public Category getCategory(int categoryId) {
//		String query = "select * from categories where categoryId=?";
//		Category categoryfromdb = jdbcTemplate.queryForObject(query, new CategoryRowMapper(),categoryId);
//		return categoryfromdb;
//		
//	}
//	
//	//update categoty from db
//	public Category updateCategory(int categoryId,Category newCategory )
//	{
//		String query = "update categories set title=?,categoryDesc=? where categoryId =?";
//		int update = jdbcTemplate.update(query,newCategory.getTitle(),newCategory.getCategoryDesc(),categoryId);
//		
//		newCategory.setCategoryId(categoryId);
//		return newCategory;
//	}
//	
//	//delete category from db
//	public void deleteCategory(int categoryId)
//	{
//		String query = "delete from categories where categoryId=?";
//		int deleted = jdbcTemplate.update(query,categoryId);
//		System.out.println(deleted + "row deleted");
//	}
//}
//
//
//
//
//
//
//
//
//
//
//
