package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
 
import com.example.demo.model.Employee;


public class CustomRepositoryImpl implements CustomRepository {

	@Autowired
	private MongoTemplate mongoTemplate;
	@Override
	public List<Employee>findEmployeeByName(String name){
		
		 Query query = new Query(Criteria.where("name").is(name));
		
		 System.out.println(query);
		 System.out.println(mongoTemplate);
		 List<Employee> result = mongoTemplate.find(query, Employee.class);
		
		
		return result;
		
		
	}
	
	@Override
	public List<Employee>findEmployeeByDepartment(String deptName){
		
		 Query query = new Query(Criteria.where("department").is(deptName));
		
		 System.out.println(query);
		 System.out.println(mongoTemplate);
		 List<Employee> result = mongoTemplate.find(query, Employee.class);
		
		
		return result;
		 
		
	}
	
}
 