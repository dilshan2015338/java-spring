package com.dilshan.java.controller;

import com.dilshan.java.dto.EmployeeProfileDTO;
import com.dilshan.java.modal.Employee;
import com.dilshan.java.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeProfileDTO>> getEmployeeDetails() {
        List<Employee> employees = employeeService.getEmployeeDetails();
        List<EmployeeProfileDTO> employeeProfileDTOs = employees.stream().map(employee -> {
            EmployeeProfileDTO dto = new EmployeeProfileDTO();
            dto.setId(employee.getProfile() != null ? employee.getProfile().getId() : null);
            dto.setAddress(employee.getProfile() != null ? employee.getProfile().getAddress() : null);
            dto.setPhone(employee.getProfile() != null ? employee.getProfile().getPhone() : null);
            dto.setEmployeeId(employee.getId());
            dto.setEmployeeName(employee.getName());
            return dto;
        }).toList();
        return ResponseEntity.ok(employeeProfileDTOs);
    }

}
