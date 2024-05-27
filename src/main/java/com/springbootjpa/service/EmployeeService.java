package com.springbootjpa.service;

import java.util.List;

import com.springbootjpa.model.Employee;

public interface EmployeeService {
	public Employee findById(int id);
	public Employee createEmployee(Employee employee); 
	public Employee updateEmployee(Employee employee); 
	public void deleteEmployee(int employeeId); 
	public List<Employee> findAllEmployees(); 
}
