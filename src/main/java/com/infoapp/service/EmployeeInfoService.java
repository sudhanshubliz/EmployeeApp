package com.infoapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infoapp.entity.Employee;
import com.infoapp.repository.EmployeeInfoRepository;

@Service
public class EmployeeInfoService {


	@Autowired
	private EmployeeInfoRepository employeeInfoRepository;
	
	
	public Employee createmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeInfoRepository.save(employee);
	}


	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return employeeInfoRepository.findOne(id);
	}


	public Iterable<Employee> getAllEmployeeInfo() {
		// TODO Auto-generated method stub
		return employeeInfoRepository.findAll();
	}


	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		employeeInfoRepository.delete(id);
		
	}


	public Employee updateEmployee(Long id, Employee employee) {
		// TODO Auto-generated method stub
		Employee employeeFromDb = employeeInfoRepository.findOne(id);
		Employee updatedemployee = employeeInfoRepository.save(employeeFromDb);
		
		return updatedemployee;
	}

	
}
