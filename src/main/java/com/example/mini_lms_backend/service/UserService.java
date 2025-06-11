package com.example.mini_lms_backend.service;

import com.example.mini_lms_backend.entity.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    Optional<User> findByUsername(String username);
    boolean existsByUsername(String username);
}