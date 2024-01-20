package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;
@Service
public class ProductServiceImpl implements ProductService{
@Autowired
private ProductDao pdao;

	@Override
	public List<Product> getAllProducts() {
		
		return pdao.findAllProducts();
	}

	@Override
	public Product getById(int pid) {
		
		return pdao.findByid(pid);
	}

	@Override
	public void addNewProduct(Product p) {
	pdao.save(p);
		
	}

	@Override
	public void updateByid(Product p) {
		pdao.modifyByid(p);
		
	}

	@Override
	public void removeById(int pid) {
pdao.removeById(pid);		
	}

}
