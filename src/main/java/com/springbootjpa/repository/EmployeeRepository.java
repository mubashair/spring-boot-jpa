package com.springbootjpa.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springbootjpa.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeRepository {
	private EntityManager entityManager;
	
	public Employee findById(int id) {
		return entityManager.find(Employee.class, id);
	}
	public Employee createEmployee(Employee employee) {//insert or update the record : if record exist it will update record
		                                               //if not exist it will insert or create the new record
		return entityManager.merge(employee);
	}
	public Employee updateEmployee(Employee employee) {
		//insert or update the record : if record exist it will update record
        //if not exist it will insert or create the new record
       return entityManager.merge(employee);
    }
	public void deleteEmployee(int employeeId) {
		Employee employee = findById(employeeId);
		entityManager.remove(employee);
	}
	public List<Employee> findAllEmployees() {
		TypedQuery<Employee> query = entityManager.createNamedQuery("select_all_employee", Employee.class);
		return query.getResultList();
		
	}


}
