//package com.spring_boot.example.serviceimpl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Service;
//
//import com.spring_boot.example.dao.CategoryDao;
//import com.spring_boot.example.entities.Category;
//import com.spring_boot.example.service.CategoryService;
//
//@Service
//@Primary
//public class CategoryDaoServiceImpl implements CategoryService{
//
//	@Autowired
//	private CategoryDao categoryDao;
//	
//	@Override
//	public Category createCategory(Category category) {
//		// TODO Auto-generated method stub
//		return categoryDao.createCategory(category);
//	}
//
//	@Override
//	public List<Category> getAllCategory() {
//		// TODO Auto-generated method stub
//		return categoryDao.getAllCategory();
//	}
//
//	@Override
//	public Category getCategory(int categoryId) {
//		// TODO Auto-generated method stub
//		return categoryDao.getCategory(categoryId);
//	}
//
//	@Override
//	public Category updateCategory(int categoryId, Category newCategory) {
//		// TODO Auto-generated method stub
//		return categoryDao.updateCategory(categoryId, newCategory);
//	}
//
//	@Override
//	public void deleteCategory(int categoryId) {
//		// TODO Auto-generated method stub
//		categoryDao.deleteCategory(categoryId);
//	}
//
//}
