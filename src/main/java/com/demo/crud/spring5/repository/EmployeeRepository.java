package com.demo.crud.spring5.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.demo.crud.spring5.model.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class EmployeeRepository {

	private static Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

	static {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Prateek");

		Employee employee1 = new Employee();
		employee1.setId(2);
		employee1.setName("Priya");

		employeeMap.put(1, employee);
		employeeMap.put(2, employee1);

	}

	public static Flux<Employee> getAllEmployees() {
		return Flux.fromIterable(employeeMap.values());
	}
	
	public static Mono<Employee> fetchEmployee(Integer key) {
		return Mono.just(employeeMap.get(key));
	}

}
