package com.service.EduSphere.controller;

import com.service.EduSphere.model.students.Student;
import com.service.EduSphere.model.students.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @GetMapping("/student/get-all") // Get all students
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @PostMapping("/student/save") // Save a student
    public Student save(@RequestBody Student student) {
        return studentDao.save(student);
    }

    // You can add more endpoints as needed for updating, deleting, or getting a specific student.
}