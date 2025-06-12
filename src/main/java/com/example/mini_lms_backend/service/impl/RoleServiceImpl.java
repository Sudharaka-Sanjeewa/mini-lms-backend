package com.example.mini_lms_backend.service.impl;

import com.example.mini_lms_backend.entity.Role;
import com.example.mini_lms_backend.repository.RoleRepository;
import com.example.mini_lms_backend.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public Role createRole(String roleName) {
        if (roleRepository.existsByName(roleName)) {
            throw new RuntimeException("Role already exists: " + roleName);
        }
        Role role = new Role();
        role.setName(roleName);
        return roleRepository.save(role);
    }

    @Override
    public Role getRoleByName(String roleName) {
        return roleRepository.findByName(roleName)
                .orElseThrow(() -> new RuntimeException("Role not found: " + roleName));
    }
}