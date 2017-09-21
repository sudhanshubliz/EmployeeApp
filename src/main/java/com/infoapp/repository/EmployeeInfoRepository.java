package com.infoapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infoapp.entity.Employee;

@Repository
public interface EmployeeInfoRepository extends CrudRepository<Employee,Long>{

}
