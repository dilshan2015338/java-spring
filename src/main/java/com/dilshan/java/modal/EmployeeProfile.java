package com.dilshan.java.modal;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employee_profiles")
@Data
public class EmployeeProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private String phone;
    
    @OneToOne
    @JoinColumn(name = "employee_id", unique = true)
    private Employee employee;
}