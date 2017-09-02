package com.sz.model;

public class User {
	private String name;
	private String sex;
	
	public void Hello()
	{
		 System.out.println("Ãû×Ö£º"+this.name+"£¬ÐÔ±ð£º"+this.sex);
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
