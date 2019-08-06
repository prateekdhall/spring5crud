package com.demo.crud.spring5.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.crud.spring5.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {

	

	Employee fetchEmployee(String key);

}
