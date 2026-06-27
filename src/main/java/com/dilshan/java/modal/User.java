package com.dilshan.java.modal;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Temporal;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data                    // Generates getters, setters, toString, equals, hashCode
@NoArgsConstructor       // Default constructor
@AllArgsConstructor      // Constructor with all fields
@Builder                 // Builder pattern
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(unique = true, nullable = false, length = 100)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Integer age;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}