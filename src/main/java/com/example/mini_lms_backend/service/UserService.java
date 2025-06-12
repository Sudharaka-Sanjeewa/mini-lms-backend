package com.example.mini_lms_backend.service;

import com.example.mini_lms_backend.dto.UserRegisterRequestDTO;

public interface UserService {
    void registerUser(UserRegisterRequestDTO request);
}