package com.example.mini_lms_backend.service.impl;

import com.example.mini_lms_backend.dto.UserRegisterRequestDTO;
import com.example.mini_lms_backend.entity.Role;
import com.example.mini_lms_backend.entity.User;
import com.example.mini_lms_backend.repository.RoleRepository;
import com.example.mini_lms_backend.repository.UserRepository;
import com.example.mini_lms_backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void registerUser(UserRegisterRequestDTO request) {
        if (userRepository.existsByUsername(request.getUsername())) {
            throw new RuntimeException("Username is already taken");
        }

        Role userRole = roleRepository.findByName("ROLE_USER")
                .orElseThrow(() -> new RuntimeException("Default role not found"));

        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRoles(Collections.singleton(userRole));

        userRepository.save(user);
    }
}