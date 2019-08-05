package com.demo.crud.spring5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.crud.spring5.model.Employee;
import com.demo.crud.spring5.repository.EmployeeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepo;

	@GetMapping("/all")
	public Flux<Employee> getAllEmployees() {
		return EmployeeRepository.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public Mono<Employee> getEmployee(@PathVariable String id) {
		return EmployeeRepository.fetchEmployee(Integer.parseInt(id));
	}

}
