package com.example.mini_lms_backend.service;

import com.example.mini_lms_backend.dto.UserRegisterRequest;

public interface UserService {
    void registerUser(UserRegisterRequest request);
}