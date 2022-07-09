//package com.spring_boot.example.serviceimpl;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.stereotype.Service;
//
//import com.spring_boot.example.entities.Product;
//import com.spring_boot.example.service.ProductService;
//
//@Service
//public class ProductServiceImpl implements ProductService{
//
//	List<Product> list = new ArrayList<>();
//	
//	@Override
//	public Product createProduct(Product product) {
//		// TODO Auto-generated method stub
//
//		System.out.println(product.getProductName());
//
//		list.add(product);
//		return product;
//
//	}
//
//	@Override
//	public List<Product> getAllProducts() {
//		// TODO Auto-generated method stub
//		return list;
//	}
//
//	@Override
//	public Product getProduct(int productId) {
//		// TODO Auto-generated method stub
//		
//
//		Product product = list.stream().filter(p->p.getProductId()==productId).findFirst().get();
//		System.out.println(product.getProductName());
//		return product;
//	}
//
//	@Override
//	public Product updateProduct(Product newProduct, int productId) {
//		// TODO Auto-generated method stub
//		List<Product> updatedList = list.stream().map(p->
//		{
//			if(p.getProductId()==productId)
//			{
//				p.setProductName(newProduct.getProductName());
//				p.setProductDesc(newProduct.getProductDesc());
//				p.setProductPrice(newProduct.getProductPrice());
//				p.setStock(newProduct.isStock());
//				
//				return p;
//			}else
//			{
//				return p;
//			}
//			
//			
//		}).collect(Collectors.toList());
//		
//		list =updatedList;
//		newProduct.setProductId(productId);
//		return newProduct;
//	}
//
//	@Override
//	public void deleteProduct(int productId) {
//		// TODO Auto-generated method stub
//		List<Product> newList = list.stream().filter(p->p.getProductId()!=productId).collect(Collectors.toList());
//		list=newList;
//		
//	}
//
//	
//	
//}
