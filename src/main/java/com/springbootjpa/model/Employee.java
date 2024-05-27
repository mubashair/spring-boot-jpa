package com.springbootjpa.model;

//import org.hibernate.annotations.NamedQuery;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


@Entity//need to map java class object with database table
//need to map porperties java class  with database table column

//@NamedQuery(name = "select_all_employee", query = "SELECT E FROM Employee E")//HQL, JPQL

@Table(name = "EMPLOYEE")
public class Employee {
	@Id//id will define relationship with primary key in db table
	@GeneratedValue
	private Integer id;
	private String firstName;
	private String lastName;
	private Long mobileNumber;
	private Integer age;
	private String email;
	
	

	//getters and setter
	
	public Integer getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public Integer getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
