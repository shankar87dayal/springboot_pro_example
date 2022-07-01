package com.spring_boot.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_boot.example.entities.Category;
import com.spring_boot.example.serviceimpl.CategoryServiceImpl;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryServiceImpl categoryServiceImpl;
	
	//create category
	@PostMapping("/create")
	public Category createCategory(@RequestBody Category category)
	{
		Category createCategory = categoryServiceImpl.createCategory(category);
		System.out.println("category created");
		
		return createCategory;
	}
	
	//get All category
	@GetMapping("/list-category")
	public List<Category> getAllCategory()
	{
		List<Category> lists = categoryServiceImpl.getAllCategory();
		return lists;
	}
	
	//get single category
	@GetMapping("get-category/{categoryId}")
	public Category getcategory(@PathVariable int categoryId)
	{
		Category category = categoryServiceImpl.getCategory(categoryId);
		return category;
	}
	
	//update category
	@PutMapping("/update/{categoryId}")
	public Category updateCategory(@PathVariable int categoryId, @RequestBody Category newCategory)
	{
		Category updatedCategory = categoryServiceImpl.updateCategory(categoryId, newCategory);
		
		return updatedCategory;
	}
	
	//delete category
	@DeleteMapping("delete/{categoryId}")
	public String deleteCategory(@PathVariable int categoryId)
	{
		categoryServiceImpl.deleteCategory(categoryId);
		return "category deleted successfully";
	}
}
