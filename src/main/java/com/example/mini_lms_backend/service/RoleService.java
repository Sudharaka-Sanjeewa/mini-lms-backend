package com.example.mini_lms_backend.service;

import com.example.mini_lms_backend.entity.Role;

import java.util.Optional;

public interface RoleService {
    Role saveRole(Role role);
    Optional<Role> findByName(String name);
}