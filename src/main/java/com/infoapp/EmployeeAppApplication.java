package com.infoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infoapp.entity.Employee;
import com.infoapp.service.EmployeeInfoService;

@SpringBootApplication
public class EmployeeAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =  SpringApplication.run(EmployeeAppApplication.class, args);
		
		
       EmployeeInfoService employeeInfoService = applicationContext.getBean("employeeInfoService", EmployeeInfoService.class);
		
		Employee employee = new Employee();
		employee.setName("Sudhanshu"); 
		employee.setEmail("Sudhanshu.thakur@capgemini.com");
		employee.setPhoneNo("9910092975");
		employee.setPassword("admin");
 		 
		employeeInfoService.createmployee(employee);
	}
}
