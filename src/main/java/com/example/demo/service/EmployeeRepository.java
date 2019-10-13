package com.example.demo.service;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.example.demo.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Integer>,CustomRepository{
	
	
	List<Employee> findEmployeeByName(String empName);
	
	List<Employee> findEmployeeByDepartment(String deptName);
	

}
