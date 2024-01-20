package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface ProductDao {

	List<Product> findAllProducts();

	Product findByid(int pid);

	void save(Product p);

	void modifyByid(Product p);

	void removeById(int pid);

	

}
