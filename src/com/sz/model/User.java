package com.sz.model;

public class User {
	private String name;
	private String sex;
	
	public void Hello()
	{
		 System.out.println("���֣�"+this.name+"���Ա�"+this.sex);
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
