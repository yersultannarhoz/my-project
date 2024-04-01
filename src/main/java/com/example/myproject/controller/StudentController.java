package com.example.myproject.controller;

import com.example.myproject.dto.StudentDto;
import com.example.myproject.model.Student;
import com.example.myproject.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getStudentName() {
        log.info("get all students!");
        return studentService.getAllStudents();
    }

    @PostMapping
    public void addStudent(@RequestBody StudentDto dto) {
        Student student = new Student();
        student.setFirstName(dto.getFirstName());
        student.setLastName(dto.getLastName());
        studentService.saveStudents(student);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        log.info("get student by id: {}", id);
        return studentService.getStudentById(id);
    }

}
