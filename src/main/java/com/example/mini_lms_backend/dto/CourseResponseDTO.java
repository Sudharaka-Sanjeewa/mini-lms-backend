package com.example.mini_lms_backend.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class CourseResponseDTO {
    private Long id;
    private String title;
    private String description;
}