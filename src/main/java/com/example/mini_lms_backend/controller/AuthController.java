package com.example.mini_lms_backend.controller;

import com.example.mini_lms_backend.dto.UserLoginRequest;
import com.example.mini_lms_backend.dto.UserSignupRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@Valid @RequestBody UserSignupRequest request) {
        // TODO: Implement signup logic using UserService
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@Valid @RequestBody UserLoginRequest request) {
        // TODO: Implement login logic using AuthenticationManager and JWT
        return ResponseEntity.ok("Login successful");
    }
}