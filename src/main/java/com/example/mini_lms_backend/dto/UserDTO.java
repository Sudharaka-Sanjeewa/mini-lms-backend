package com.example.mini_lms_backend.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String username;
    private String password;
    private String role; // Example: ROLE_USER or ROLE_ADMIN
}