package com.example.mini_lms_backend.service;

import com.example.mini_lms_backend.entity.Role;

public interface RoleService {
    Role createRole(String roleName);
    Role getRoleByName(String roleName);
}