package com.dilshan.java.service;

import com.dilshan.java.modal.Employee;
import com.dilshan.java.repo.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        // Constructor logic if needed
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployeeDetails() {
        return employeeRepository.findAll();
    }
}
