package com.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
@Autowired
private ProductService pservice;
@GetMapping("/product")
public 	ResponseEntity<List<Product>>getAllProducts(){
	return ResponseEntity.ok(pservice.getAllProducts());
	
}
@GetMapping("/product/{pid}")
public ResponseEntity<Product>getAllProducts(@PathVariable int pid){
	Product p=pservice.getById(pid);
	if(p!=null) {
		return ResponseEntity.ok(p);
	}else {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
}
@PostMapping("/product/{pid}")
public ResponseEntity<String>addnewProduct(@RequestBody Product p){
pservice.addNewProduct(p);
return ResponseEntity.ok("data inserted successfully");	
}
@PutMapping("/product/{pid}")
public ResponseEntity<String>UpdateProduct(@RequestBody Product p){
	pservice.updateByid(p);
	return ResponseEntity.ok("Data Updated Successfully बधाई  हो आप सभी को ");
}
@DeleteMapping("/product/{pid}")
public ResponseEntity<String>deleteProduct(@PathVariable int pid){
	pservice.removeById(pid);
	return ResponseEntity.ok("Data deleted Successfully");
	}
}