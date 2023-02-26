package com.example.Service.panel.API.service;

import com.example.Service.panel.API.model.Student;
import com.example.Service.panel.API.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public interface StudentService {

    public List<Student> getStudents();

    public void addNewStudent(Student student);

    public void deleteStudent(Long studentId);

    public void updateStudent(Long studentId, String name, String email);
}
