package com.example.mini_lms_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table(name = "roles")
public class Role {

    // Getters and setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(nullable = false, unique = true)
    private String name;

    // Default constructor
    public Role() {
    }

    // New constructor with name parameter
    public Role(String name) {
        this.name = name;
    }
}
