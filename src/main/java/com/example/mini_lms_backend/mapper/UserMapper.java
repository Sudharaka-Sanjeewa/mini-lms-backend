package com.example.mini_lms_backend.mapper;

import com.example.mini_lms_backend.dto.UserResponseDTO;
import com.example.mini_lms_backend.entity.User;
import com.example.mini_lms_backend.entity.Role;

import java.util.stream.Collectors;

public class UserMapper {

    public static UserResponseDTO toDTO(User user) {
        if (user == null) return null;

        return UserResponseDTO.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .roles(user.getRoles()
                        .stream()
                        .map(Role::getName)
                        .collect(Collectors.toSet()))
                .build();
    }
}