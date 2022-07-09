//package com.spring_boot.example.serviceimpl;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.stereotype.Service;
//
//import com.spring_boot.example.entities.Category;
//import com.spring_boot.example.service.CategoryService;
//
//@Service
//public class CategoryServiceImpl  implements CategoryService{
//
//	List<Category> list = new ArrayList<>();
//	
//	// creating a category
//	@Override
//	public Category createCategory(Category category) {
//		// TODO Auto-generated method stub
//		//System.out.println(category.getCategoryId());
//		list.add(category);
//		return category;
//	}
//
//	//get all
//	@Override
//	public List<Category> getAllCategory() {
//		// TODO Auto-generated method stub
//		
//		return list;
//	}
//
//	//get single
//	@Override
//	public Category getCategory(int categoryId) {
//		// TODO Auto-generated method stub
//		Category category = list.stream().filter(c->c.getCategoryId() == categoryId).findFirst().get();
//		//System.out.println(category.getCategoryId());
//		return category;
//	}
//
//	//update
//	
//	@Override
//	public Category updateCategory(int categoryId, Category newCategory) {
//		// TODO Auto-generated method stub
//		List<Category> updatedlist = list.stream().map(c->{
//			if(c.getCategoryId()==categoryId)
//			{
//				c.setTitle(newCategory.getTitle());
//				c.setCategoryDesc(newCategory.getCategoryDesc());
//				return c;
//			}else
//			{
//				return c;
//			}
//		}).collect(Collectors.toList());
//		
//		list = updatedlist;
//		newCategory.setCategoryId(categoryId);
//		
//		return newCategory;
//	}
//
//	//delete
//	
//	@Override
//	public void deleteCategory(int categoryId) {
//		// TODO Auto-generated method stub
//		List<Category> newList = list.stream().filter(c-> c.getCategoryId()!=categoryId).collect(Collectors.toList());
//		list = newList;
//	}
//
//}
