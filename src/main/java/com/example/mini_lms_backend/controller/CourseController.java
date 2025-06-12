package com.example.mini_lms_backend.controller;

import com.example.mini_lms_backend.dto.CourseRequestDTO;
import com.example.mini_lms_backend.dto.CourseResponseDTO;
import com.example.mini_lms_backend.entity.Course;
import com.example.mini_lms_backend.mapper.CourseMapper;
import com.example.mini_lms_backend.service.CourseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @PostMapping
    public ResponseEntity<CourseResponseDTO> create(@Valid @RequestBody CourseRequestDTO request) {
        Course created = courseService.createCourse(CourseMapper.toEntity(request));
        return ResponseEntity.ok(CourseMapper.toDTO(created));
    }

    @GetMapping
    public ResponseEntity<List<CourseResponseDTO>> getAll() {
        List<CourseResponseDTO> courses = courseService.getAllCourses().stream()
                .map(CourseMapper::toDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(courses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseResponseDTO> getById(@PathVariable Long id) {
        Course course = courseService.getCourseById(id);
        return ResponseEntity.ok(CourseMapper.toDTO(course));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CourseResponseDTO> update(
            @PathVariable Long id,
            @Valid @RequestBody CourseRequestDTO request
    ) {
        Course updated = courseService.updateCourse(id, CourseMapper.toEntity(request));
        return ResponseEntity.ok(CourseMapper.toDTO(updated));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return ResponseEntity.noContent().build();
    }
}