package com.example.mini_lms_backend.dto;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDTO {
    private Long id;
    private String username;
    private String email;
    private Set<String> roles; // Set of role names (e.g., "ROLE_ADMIN")
}