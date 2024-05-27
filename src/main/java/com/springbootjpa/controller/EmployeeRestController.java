package com.springbootjpa.controller;

import java.util.List;

import org.springframework.aot.generate.AccessControl.Visibility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.springbootjpa.model.Employee;
import com.springbootjpa.service.EmployeeService;

@RestController
public class EmployeeRestController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("findEmployeeById/{employeeId}")
	public Employee findById(@PathVariable int employeeId) {
		return employeeService.findById(employeeId);
	}
	@PostMapping("createEmployee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	@PutMapping("updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	@DeleteMapping("deleteEmployee/{employeeId}")
	public void deleteEmployee(@PathVariable int employeeId) {
		employeeService.deleteEmployee(employeeId);
	}
	@GetMapping("/findAllEmployees")
	public List<Employee> findAllEmployees(){
		return employeeService.findAllEmployees();
	} 

}
