package com.service.EduSphere.controller;

import com.service.EduSphere.model.teachers.Teacher;
import com.service.EduSphere.model.teachers.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherDao teacherDao;

    @GetMapping("/teacher/get-all") // Get all teachers
    public List<Teacher> getAllTeachers() {
        return teacherDao.getAllTeachers();
    }

    @PostMapping("/teacher/save") // Save a teacher
    public Teacher save(@RequestBody Teacher teacher) {
        return teacherDao.save(teacher);
    }

    // You can add more endpoints as needed for updating, deleting, or getting a specific teacher.
}