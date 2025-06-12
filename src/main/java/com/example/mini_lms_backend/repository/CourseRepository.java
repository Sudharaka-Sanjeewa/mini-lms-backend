package com.example.mini_lms_backend.repository;

import com.example.mini_lms_backend.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}