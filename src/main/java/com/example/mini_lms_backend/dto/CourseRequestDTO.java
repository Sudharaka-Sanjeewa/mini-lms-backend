package com.example.mini_lms_backend.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class CourseRequestDTO {
    @NotBlank(message = "Title is required")
    private String title;

    private String description;
}