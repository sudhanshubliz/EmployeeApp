package com.infoapp;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.infoapp.entity.Employee;
import com.infoapp.service.EmployeeInfoService;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
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
 	private ApiInfo metaData() {
		 
		 return new ApiInfoBuilder()
	                .title("Spring REST Sample with Swagger")
	                .description("Spring REST Sample with Swagger")
	                .termsOfServiceUrl("https://github.com/sudhanshubliz")
	                .contact(new Contact("name", "url", "email"))
	                .license("Apache License Version 2.0")
	                .licenseUrl("https://github.com/sudhanshubliz/EmployeeApp")
	                .version("2.0")
	                .build();
		  
	    }
	 
	    public Docket employeeApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	        		.select()
	                .apis(RequestHandlerSelectors.basePackage("com.infoapp.controller"))
	                .paths(regex("/employee.*"))
	                .build().apiInfo(metaData()) ;
	    }
}
