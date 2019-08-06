package com.demo.crud.spring5.service;

import com.demo.crud.spring5.model.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {

	Flux<Employee> getAllEmployees();

	Mono<Employee> fetchEmployee(String key);
	
	void create(Employee emp);
	
}
