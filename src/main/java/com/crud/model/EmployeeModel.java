package com.crud.model;

public class EmployeeModel {
	
	private String name;
	private String city;
	private long age;
	private long mobile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	public EmployeeModel(String name, String city, long age, long mobile) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
		this.mobile = mobile;
	}
	public EmployeeModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeModel [name=" + name + ", city=" + city + ", age=" + age + ", mobile=" + mobile + "]";
	}
	
	

}
