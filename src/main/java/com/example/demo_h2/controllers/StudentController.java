package com.example.demo_h2.controllers;

import com.example.demo_h2.entities.Student;
import com.example.demo_h2.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/list")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @PostMapping("/generate")
    public Student createStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }
}
