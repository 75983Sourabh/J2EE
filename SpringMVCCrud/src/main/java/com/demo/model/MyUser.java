package com.demo.model;

public class MyUser {
	private int Uid;
	private String Username;
	private String Roles;
	public MyUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyUser(int uid, String username, String roles) {
		super();
		Uid = uid;
		Username = username;
		Roles = roles;
	}
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getRoles() {
		return Roles;
	}
	public void setRoles(String roles) {
		Roles = roles;
	}
	@Override
	public String toString() {
		return "MyUser [Uid=" + Uid + ", Username=" + Username + ", Roles=" + Roles + "]";
	}
	
	

}
