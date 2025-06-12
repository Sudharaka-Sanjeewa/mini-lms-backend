package com.example.mini_lms_backend.service;

import com.example.mini_lms_backend.entity.Course;
import java.util.List;

public interface CourseService {
    Course createCourse(Course course);
    List<Course> getAllCourses();
    Course getCourseById(Long id);
    Course updateCourse(Long id, Course course);
    void deleteCourse(Long id);
}