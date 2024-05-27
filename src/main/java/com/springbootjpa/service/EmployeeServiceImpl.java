package com.springbootjpa.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.springbootjpa.model.Employee;
import com.springbootjpa.repository.EmployeeRepository;
@Component
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee findById(int id) {
		return employeeRepository.findById(id);
	}

	@Override
	public Employee createEmployee(Employee employee) {
		
		return employeeRepository.createEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return employeeRepository.updateEmployee(employee);
	}

	@Override
	public void deleteEmployee(int employeeId) {
		employeeRepository.deleteEmployee(employeeId);
		
	}

	@Override
	public List<Employee> findAllEmployees() {
		
		return employeeRepository.findAllEmployees();
		
	}

}
