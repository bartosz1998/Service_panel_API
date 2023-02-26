package com.example.Service.panel.API.service.mapper;

import com.example.Service.panel.API.model.Student;
import com.example.Service.panel.API.service.dto.StudentDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper implements MapStructMapper {

    @Override
    public StudentDto studentToStudentDto(StudentDto studentDto) {
        if (studentDto == null) {
            return null;
        } else {
            Student student = new Student();
            student.setId(studentDto.getId());
            student.setName(studentDto.getName());
            student.setEmail(studentDto.getEmail());
            student.setDob(studentDto.getDob());
            return studentDto;
        }
    }
}
