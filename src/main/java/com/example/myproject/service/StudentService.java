package com.example.myproject.service;

import com.example.myproject.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    void saveStudents(Student student);
    Student getStudentById(Long id);

}
