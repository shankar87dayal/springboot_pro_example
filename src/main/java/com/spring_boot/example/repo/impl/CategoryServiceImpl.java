package com.spring_boot.example.repo.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot.example.entities.Category;
import com.spring_boot.example.repo.CategoryRepository;
import com.spring_boot.example.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public Category createCategory(Category category) {
		// TODO Auto-generated method stub
		Category created = categoryRepository.save(category);
		return created;
	}

	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		List<Category> all = categoryRepository.findAll();
		return all;
	}

	@Override
	public Category getCategory(int categoryId) {
		// TODO Auto-generated method stub
		Category category = categoryRepository.findById(categoryId).get();
		return category;
	}

	@Override
	public Category updateCategory(int categoryId, Category newCategory) {
		// TODO Auto-generated method stub
		
		Category category = categoryRepository.findById(categoryId).get();
		category.setCategoryDesc(newCategory.getCategoryDesc());
		category.setTitle(newCategory.getTitle());
		
		Category updated = categoryRepository.save(category);
		
		return updated;
	}

	@Override
	public void deleteCategory(int categoryId) {
		// TODO Auto-generated method stub
		
		Category category = categoryRepository.findById(categoryId).get();
		categoryRepository.delete(category);
		
	}

}
