package com.example.Service.panel.API.service.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@Data
public class StudentDto {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
}
