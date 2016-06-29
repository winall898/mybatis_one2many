package com.wujiang.entity;

public class User {

	private Integer id;//用户id

	private String username;//用户名

	private String password;//密码

	private String address;//地址

	public User(){
		
	}
	
	public User(String username,String password,String address){
		this.username = username;
		this.password = password;
		this.address =address;
	}
	
	public User(Integer id,String username,String password,String address){
		this.id = id;
		this.username = username;
		this.password = password;
		this.address =address;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString(){
		return "当前用户为：id = "+id+",username = "+username+",password = "+password+",address = "+address;
	}

}
