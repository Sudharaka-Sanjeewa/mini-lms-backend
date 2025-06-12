package com.example.mini_lms_backend.service;

import com.example.mini_lms_backend.dto.UserRegisterRequestDTO;
import com.example.mini_lms_backend.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void deleteUserById(Long id);
    void registerUser(UserRegisterRequestDTO request);
}