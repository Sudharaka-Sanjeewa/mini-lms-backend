package com.example.mini_lms_backend.mapper;

import com.example.mini_lms_backend.dto.UserDTO;
import com.example.mini_lms_backend.entity.User;

public class UserMapper {
    public static User toEntity(UserDTO dto) {
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        return user;
    }
}