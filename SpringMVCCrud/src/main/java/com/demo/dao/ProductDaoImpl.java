package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;
@Repository
public class ProductDaoImpl implements ProductDao{
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public List<Product> findAllProduct() {
		
		return jdbcTemplate.query("select * from product",(rs,num)->{
			Product p =new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getDouble(4));
			return p;
		}
		);
	}

}
