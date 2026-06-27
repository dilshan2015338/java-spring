package com.dilshan.java.dto;

import lombok.Data;

// DTO for EmployeeProfile
@Data
public class EmployeeProfileDTO {
    private Long id;
    private String address;
    private String phone;
    private Long employeeId;  // Only the ID, not the full object
    private String employeeName;  // Only needed fields
}