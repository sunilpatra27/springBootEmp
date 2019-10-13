package com.example.demo.controlller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/addEmployee")
	public String saveEmployee(@RequestBody Employee employee) {
		
		 employeeRepository.save(employee);
		 
		 return "Employee Added with Id"+employee.getId();
		
	}
	
	@GetMapping("/getAllEmployees")
	
	public List<Employee> getAllEmployees(){
		
		return employeeRepository.findAll();
		
	}
	
	@PostMapping("/getEmployeeByName")
	public List<Employee> getEmployeeById(@RequestBody Employee emp){
		
		System.out.println("hii");
		
		return employeeRepository.findEmployeeByName(emp.getName());
		
		
		
	
	} 
	
	@PostMapping("/getEmployeeDept")
	public List<Employee> findEmployeeByDepartment(@RequestBody Employee emp){
		
		System.out.println("hii");
		
		return employeeRepository.findEmployeeByDepartment(emp.getDepartment());
		
		
		
	
	} 

}
