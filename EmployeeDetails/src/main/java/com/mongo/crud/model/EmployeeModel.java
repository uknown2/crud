package com.mongo.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employeer")
public class EmployeeModel {
	
	@Id
	private int id;
	
	private String name;
	private String address;
	private int age;
	private Long mobileNo;
	
	public EmployeeModel() {
		
	}
	public EmployeeModel(int id, String name, String address, int age, Long mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.mobileNo = mobileNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
}
