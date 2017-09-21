package com.infoapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Employee {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Long id;	
	
	@Column(name = "name")
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password")	
    private String password;

    @Column(name = "phoneNo")
    private String phoneNo;
    

	public Employee(Long id) {
		this.id = id;
	}


	public Employee(Long id, String name, String email, String password, String phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", phoneNo="
				+ phoneNo + "]";
	}

	
 

    
}
