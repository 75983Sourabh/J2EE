package com.demo.model;

public class Product {

	private int Pid;
	private String Pname;
	private int Quantity;
	private int Price;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pname, int quantity, int price) {
		super();
		Pid = pid;
		Pname = pname;
		Quantity = quantity;
		Price = price;
	}

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Product [Pid=" + Pid + ", Pname=" + Pname + ", Quantity=" + Quantity + ", Price=" + Price + "]";
	}

}
