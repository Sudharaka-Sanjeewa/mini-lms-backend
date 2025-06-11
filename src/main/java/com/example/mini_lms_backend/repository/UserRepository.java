package com.example.mini_lms_backend.repository;

import com.example.mini_lms_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username); // for authentication
    boolean existsByUsername(String username);       // for registration checks
}