package com.telusko.myFirstWeb.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.telusko.myFirstWeb.model.Product;

@Service
public class ProductService {

	
	List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"Iphone",50000), 
			new Product(102,"Oppo",20000), 
			new Product(103,"Samsung",20000),
			new Product(104,"Google",50000)));
	
	public List<Product> getProducts(){
		return products;
	}

	public Product getProductById(int prodId) {
		// TODO Auto-generated method stub
		return products.stream().filter(p->p.getProdId()==prodId).findFirst().orElse(new Product(0,null,0));
	}

	public void addProductInService(Product prod) {
		products.add(prod);
	}

	public void updateProduct(Product prod) {
		// TODO Auto-generated method stub
		int index=0;
		for(int i=0; i<products.size();i++) {
			if(products.get(i).getProdId()==prod.getProdId()) {
				index=i;
			}
		}
		products.set(index,prod);
	}

	public void deleteProduct(int prodId) {
		// TODO Auto-generated method stub
		int index=0;
		for(int i=0; i<products.size();i++) {
			if(products.get(i).getProdId()==prodId) {
				index=i;
			}
		}
		products.remove(index);
	}

}
