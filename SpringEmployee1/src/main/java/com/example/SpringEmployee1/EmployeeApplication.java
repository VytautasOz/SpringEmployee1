package com.example.SpringEmployee1;

import com.example.SpringEmployee1.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@RequiredArgsConstructor
public class EmployeeApplication {
	private final EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void insertTestData() {
		employeeService.addTestEmployees();
		System.out.println(employeeService.getAllEmployees());
	}



}
