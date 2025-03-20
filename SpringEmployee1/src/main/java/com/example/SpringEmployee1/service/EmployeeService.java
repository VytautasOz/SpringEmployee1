package com.example.SpringEmployee1.service;

import com.example.SpringEmployee1.entity.Department;
import com.example.SpringEmployee1.entity.Employee;
import com.example.SpringEmployee1.entity.Project;
import com.example.SpringEmployee1.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.saveAndFlush(employee);
    }

    public void addTestEmployees() {
        List<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee();
        employee1.setPersonalCode("39203301111");
        employee1.setName("Jonas");
        employee1.setLastName("Jonaitis");
        employee1.setBirthDate(Date.valueOf("1990-01-01"));
        employee1.setWorksFrom(Date.valueOf("2020-01-01"));
        employee1.setPosition("Developer");

        Department department1 = new Department();
        department1.setTitle("IT");
        department1.setManagerPersonalCode(employee1.getPersonalCode());

        Project project1 = new Project();
        project1.setTitle("IT project");

        employee1.setProject(project1);
        employee1.setDepartment(department1);
        employees.add(employee1);

        // Employee 2
        Employee employee2 = new Employee();
        employee2.setPersonalCode("48204301112");
        employee2.setName("Tomas");
        employee2.setLastName("Tomauskas");
        employee2.setBirthDate(Date.valueOf("1985-06-15"));
        employee2.setWorksFrom(Date.valueOf("2018-03-20"));
        employee2.setPosition("System Analyst");

        Department department2 = new Department();
        department2.setTitle("Business Analysis");
        department2.setManagerPersonalCode(employee2.getPersonalCode());

        Project project2 = new Project();
        project2.setTitle("Finance App");

        employee2.setProject(project2);
        employee2.setDepartment(department2);
        employees.add(employee2);

        // Employee 3
        Employee employee3 = new Employee();
        employee3.setPersonalCode("39215301113");
        employee3.setName("Austeja");
        employee3.setLastName("Austaitė");
        employee3.setBirthDate(Date.valueOf("1992-09-25"));
        employee3.setWorksFrom(Date.valueOf("2019-07-10"));
        employee3.setPosition("UI/UX Designer");

        Department department3 = new Department();
        department3.setTitle("Design");
        department3.setManagerPersonalCode(employee3.getPersonalCode());

        Project project3 = new Project();
        project3.setTitle("E-commerce Platform");

        employee3.setProject(project3);
        employee3.setDepartment(department3);
        employees.add(employee3);

        // Employee 4
        Employee employee4 = new Employee();
        employee4.setPersonalCode("40203301114");
        employee4.setName("Darius");
        employee4.setLastName("Dariuskas");
        employee4.setBirthDate(Date.valueOf("1988-11-03"));
        employee4.setWorksFrom(Date.valueOf("2015-09-01"));
        employee4.setPosition("DevOps Engineer");

        Department department4 = new Department();
        department4.setTitle("DevOps");
        department4.setManagerPersonalCode(employee4.getPersonalCode());

        Project project4 = new Project();
        project4.setTitle("Cloud Migration");

        employee4.setProject(project4);
        employee4.setDepartment(department4);
        employees.add(employee4);

        // Employee 5
        Employee employee5 = new Employee();
        employee5.setPersonalCode("37203301115");
        employee5.setName("Egle");
        employee5.setLastName("Eglinskaite");
        employee5.setBirthDate(Date.valueOf("1995-04-12"));
        employee5.setWorksFrom(Date.valueOf("2021-02-01"));
        employee5.setPosition("QA Engineer");

        Department department5 = new Department();
        department5.setTitle("Quality Assurance");
        department5.setManagerPersonalCode(employee5.getPersonalCode());

        Project project5 = new Project();
        project5.setTitle("Banking Security");

        employee5.setProject(project5);
        employee5.setDepartment(department5);
        employees.add(employee5);

        // Employee 6
        Employee employee6 = new Employee();
        employee6.setPersonalCode("46203301116");
        employee6.setName("Mantas");
        employee6.setLastName("Mantautas");
        employee6.setBirthDate(Date.valueOf("1991-07-19"));
        employee6.setWorksFrom(Date.valueOf("2016-10-10"));
        employee6.setPosition("Scrum Master");

        Department department6 = new Department();
        department6.setTitle("Agile Team");
        department6.setManagerPersonalCode(employee6.getPersonalCode());

        Project project6 = new Project();
        project6.setTitle("Retail CRM");

        employee6.setProject(project6);
        employee6.setDepartment(department6);
        employees.add(employee6);

        // Employee 7
        Employee employee7 = new Employee();
        employee7.setPersonalCode("48203301117");
        employee7.setName("Laura");
        employee7.setLastName("Lauraitė");
        employee7.setBirthDate(Date.valueOf("1987-05-28"));
        employee7.setWorksFrom(Date.valueOf("2012-06-15"));
        employee7.setPosition("Database Administrator");

        Department department7 = new Department();
        department7.setTitle("Database Administration");
        department7.setManagerPersonalCode(employee7.getPersonalCode());

        Project project7 = new Project();
        project7.setTitle("Big Data Analysis");

        employee7.setProject(project7);
        employee7.setDepartment(department7);
        employees.add(employee7);

        // Employee 8
        Employee employee8 = new Employee();
        employee8.setPersonalCode("47203301118");
        employee8.setName("Andrius");
        employee8.setLastName("Andraitis");
        employee8.setBirthDate(Date.valueOf("1993-03-14"));
        employee8.setWorksFrom(Date.valueOf("2017-08-22"));
        employee8.setPosition("Software Architect");

        Department department8 = new Department();
        department8.setTitle("Architecture");
        department8.setManagerPersonalCode(employee8.getPersonalCode());

        Project project8 = new Project();
        project8.setTitle("AI & ML Integration");

        employee8.setProject(project8);
        employee8.setDepartment(department8);
        employees.add(employee8);

        // Employee 9
        Employee employee9 = new Employee();
        employee9.setPersonalCode("45203301119");
        employee9.setName("Simona");
        employee9.setLastName("Simonaitė");
        employee9.setBirthDate(Date.valueOf("1989-12-05"));
        employee9.setWorksFrom(Date.valueOf("2014-04-30"));
        employee9.setPosition("Cybersecurity Specialist");

        Department department9 = new Department();
        department9.setTitle("Cybersecurity");
        department9.setManagerPersonalCode(employee9.getPersonalCode());

        Project project9 = new Project();
        project9.setTitle("Enterprise Security");

        employee9.setProject(project9);
        employee9.setDepartment(department9);
        employees.add(employee9);

        // Employee 10
        Employee employee10 = new Employee();
        employee10.setPersonalCode("48203301120");
        employee10.setName("Povilas");
        employee10.setLastName("Povilaitis");
        employee10.setBirthDate(Date.valueOf("1996-09-09"));
        employee10.setWorksFrom(Date.valueOf("2022-01-10"));
        employee10.setPosition("Junior Developer");

        Department department10 = new Department();
        department10.setTitle("IT");
        department10.setManagerPersonalCode(employee10.getPersonalCode());

        Project project10 = new Project();
        project10.setTitle("HR Management System");

        employee10.setProject(project10);
        employee10.setDepartment(department10);
        employees.add(employee10);

        employeeRepository.saveAll(employees);

    }


}


