package com.crud.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Details")  //Optional
public class EmployeeDetailsDto {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id")
	private Long empId;
	
	@Column(name="Full_name")
	private String name;
	
	@Column(name="city_name")
	private String city;
	
	private long age;
	
	@Column(name="mobile_no")
	private long mobileNo;
	
	

	@Override
	public String toString() {
		return "EmployeeDetailsDto [empId=" + empId + ", name=" + name + ", city=" + city + ", age=" + age
				+ ", mobileNo=" + mobileNo + "]";
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

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

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	
}
