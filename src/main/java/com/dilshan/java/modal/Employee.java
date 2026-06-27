package com.dilshan.java.modal;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employees")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    
    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    private EmployeeProfile profile;
}