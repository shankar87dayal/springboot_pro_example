package com.spring_boot.example.service;

import java.util.List;

import com.spring_boot.example.entities.Category;


public interface CategoryService {

	public Category createCategory(Category category);
	
	public List<Category> getAllCategory();
	
	public Category getCategory(int categoryId);
	
	public Category updateCategory(int categoryId,Category newCategory ); 
	
	public void deleteCategory(int categoryId);
	
}
