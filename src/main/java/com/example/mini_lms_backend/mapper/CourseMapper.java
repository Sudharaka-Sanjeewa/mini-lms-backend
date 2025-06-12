package com.example.mini_lms_backend.mapper;

import com.example.mini_lms_backend.dto.CourseRequestDTO;
import com.example.mini_lms_backend.dto.CourseResponseDTO;
import com.example.mini_lms_backend.entity.Course;

public class CourseMapper {

    public static Course toEntity(CourseRequestDTO dto) {
        return Course.builder()
                .title(dto.getTitle())
                .description(dto.getDescription())
                .build();
    }

    public static CourseResponseDTO toDTO(Course entity) {
        return CourseResponseDTO.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .description(entity.getDescription())
                .build();
    }
}