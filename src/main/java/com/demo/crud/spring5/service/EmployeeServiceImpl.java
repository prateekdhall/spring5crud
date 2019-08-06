package com.demo.crud.spring5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.crud.spring5.model.Employee;
import com.demo.crud.spring5.repository.EmployeeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

	@Override
	public Flux<Employee> getAllEmployees() {
		//return employeeRepo.getAllEmployees();
		return Flux.fromIterable(employeeRepo.findAll());
	}

	@Override
	public void create(Employee emp) {
		employeeRepo.save(emp);
	}

	@Override
	public Mono<Employee> fetchEmployee(String key) {
		// TODO Auto-generated method stub
		return Mono.just(employeeRepo.fetchEmployee(key));
	}

}
