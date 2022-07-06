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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring_boot.example.entities.Product;
import com.spring_boot.example.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	
//	  @RequestMapping(value = "/create-product")
//	  public Product createProduct() {
//	  Product product = new Product(); 
//	  product.setProductId(98);
//	  product.setProductName("HP I7 laptop");
//	  product.setProductDesc("this is best for programmer");
//	  product.setProductPrice(70000.00); product.setStock(true); 
//	  Product createdProduct = productService.createProduct(product);
//	  return createdProduct;
//	  
//	  
//	  }
	 
	
	//create product 
	/**
	 * <p> this method is written for creating  product </p>
	 * 
	 * @author Raushan rajnan
	 * @since 1.0
	 * @param product
	 * @return createdProduct
	 */
	
	@PostMapping( "/")
	public Product createProduct(@RequestBody Product product) {
		Product createdProduct = productService.createProduct(product);
		System.out.println("product created");
		return createdProduct;

	}

	//get ALl Prroduct
	/**
	 * <p> this method is written for featch list of category </p>
	 * 
	 * @author Raushan rajnan
	 * @since 1.0
	 * @param Noting
	 * @return listof product
	 */
	
	@GetMapping("/")
	public List<Product> listAllProducts() {
		List<Product> allProducts = productService.getAllProducts();
		return allProducts;
	}
	
	//get single product
	/**
	 * <p> this method is written for featch single product </p>
	 * 
	 * @author Raushan rajnan
	 * @since 1.0
	 * @param productId
	 * @return  product
	 */
	
	@GetMapping("/{productId}")
	public Product getProduct(@PathVariable  int productId) {
		Product product = productService.getProduct(productId);
		return product;
		
	}
	
	//pudate Product
	/**
	 * <p> this method is written for update single product </p>
	 * 
	 * @author Raushan rajnan
	 * @since 1.0
	 * @param productId
	 * @param Product
	 * @return  updatedProduct
	 */
	
	
	@PutMapping("/{productId}")
	public Product UpdateProduct(@RequestBody Product newProduct, @PathVariable int productId) {
		Product updatedProduct = productService.updateProduct(newProduct, productId);
		return updatedProduct;
	}
	
	
	//delete product
	/**
	 * <p> this method is written for delete single product </p>
	 * 
	 * @author Raushan rajnan
	 * @since 1.0
	 * @param productId
	 * @return  "product is successfully Deleted !!"
	 */
	
	@DeleteMapping("/{productId}")
	public String  deleteProduct(@PathVariable  int productId) {
		productService.deleteProduct(productId);
		return "prosuct is successfully Deleted !!";
	}
}
