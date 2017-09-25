package com.infoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infoapp.entity.Employee;
import com.infoapp.service.EmployeeInfoService;


@RestController
public class EmployeeInfoController {

	
	@Autowired
	  private EmployeeInfoService employeeInfoService;
		 
	
	@PostMapping(value="/employee/create")
	public Employee createEmployee(@RequestBody Employee employee){
		return employeeInfoService.createmployee(employee);
	}
	
	@GetMapping(value="/employee/{id}")
 	public Employee getEmployeeById(@PathVariable("id")Long id){
		return employeeInfoService.getEmployeeById(id);
	}
	

	@GetMapping(value="/employee/allemployees")
	public Iterable<Employee> getAllEmployeeInfo(){
		return employeeInfoService.getAllEmployeeInfo();
	}
	
	@DeleteMapping(value="/employee/{id}")
	public void deleteTicket(@PathVariable("id")Long id){
		employeeInfoService.deleteEmployee(id);
	}
	
	@PutMapping(value="/employee/{id}")
	public Employee updateTicket(@PathVariable("id")Long id,@RequestBody Employee employee){
		return employeeInfoService.updateEmployee(id,employee);
	}
	
	
}
