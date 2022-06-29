package com.spring_boot.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring_boot.example.ProductService;
import com.spring_boot.example.entities.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/create-product")
	public Product createProduct() {
		Product product = new Product();
		product.setProductId(98);
		product.setProductName("HP I7 laptop");
		product.setProductDesc("this is best for programmer");
		product.setProductPrice(70000.00);
		product.setStock(true);
		 Product createdProduct = productService.createProduct(product);
		return createdProduct;

	}
	/*
	 * 
	 * @RequestMapping(value="/create-product",method=RequestMethod.POST) public
	 * Product createProduct(@RequestBody Product product) { Product createdProduct
	 * = productService.createProduct(product);
	 * System.out.println("product created"); return createdProduct;
	 * 
	 * }
	 */

	@RequestMapping(value = "/list-products", method = RequestMethod.GET)
	public List<Product> listAllProducts() {
		List<Product> allProducts = productService.getAllProducts();
		return allProducts;
	}
}
