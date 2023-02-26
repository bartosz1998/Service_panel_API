package com.example.Service.panel.API.service.mapper;

import com.example.Service.panel.API.model.Student;
import com.example.Service.panel.API.service.dto.StudentDto;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring")
public interface MapStructMapper {
    StudentDto studentToStudentDto(StudentDto studentDto);
}
