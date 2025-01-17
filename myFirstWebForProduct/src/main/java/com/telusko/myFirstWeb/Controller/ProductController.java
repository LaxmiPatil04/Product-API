package com.telusko.myFirstWeb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.myFirstWeb.model.Product;
import com.telusko.myFirstWeb.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@RequestMapping("/products")
	public List<Product> getProducts(){
		return service.getProducts();
	}
	
	@RequestMapping("/products/{prodId}")
	public Product getProductById(@PathVariable int prodId){
		return service.getProductById(prodId);
	}
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Product prod){
		System.out.println(prod);
		service.addProductInService(prod);
	}
	
	@PutMapping("/products")
	public void updateProduct(@RequestBody Product prod) {
		System.out.println(prod);
		service.updateProduct(prod);
	}
	
	@DeleteMapping("/products/{prodId}")
	public void deleteProductById(@PathVariable int prodId) {
		service.deleteProduct(prodId);
	}
}
