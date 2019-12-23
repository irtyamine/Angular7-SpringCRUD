package com.crud.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeModel {
	
	private String name;
	private String city;
	private long age;
	private long mobile;
	
	public EmployeeModel(String name, String city, long age, long mobile) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
		this.mobile = mobile;
	}

	
}
