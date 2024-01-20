package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Product getById(int pid);

	void addNewProduct(Product p);

	void updateByid(Product p);

	void removeById(int pid);

}
