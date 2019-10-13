package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public interface CustomRepository {

	List<Employee> findEmployeeByName(String name);
	List<Employee> findEmployeeByDepartment(String deptName);
	

}
