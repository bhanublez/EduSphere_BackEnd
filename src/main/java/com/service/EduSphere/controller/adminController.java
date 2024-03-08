package com.service.EduSphere.controller;

import com.service.EduSphere.model.students.Student;
import com.service.EduSphere.model.students.StudentDao;
import com.service.EduSphere.model.teachers.Teacher;
import com.service.EduSphere.model.teachers.TeacherDao;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class adminController {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private TeacherDao teacherDao;

    // Endpoint to register a new student
    @PostMapping("/admin/register-student")
    public Student registerStudent(@RequestBody Student student) {
        // Implement your business logic for student registration
        // You can add validation, password hashing, etc.
        return studentDao.save(student);
    }
//
//    // Endpoint to register a new teacher
    @PostMapping("/admin/register-teacher")
    public Teacher registerTeacher(@RequestBody Teacher teacher) {
        // Implement your business logic for teacher registration
        // You can add validation, password hashing, etc.
        return teacherDao.save(teacher);
    }
    @PostMapping("/admin/process_register_student")
    public String processRegisterStudent(Student user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        studentDao.save(user);
        return "register_success";
    }
    @PostMapping("/admin/process_register_teacher")
    public String processRegisterTeacher(Student user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        //Hashing for more security
        encodedPassword= hashPassword(encodedPassword);
        user.setPassword(encodedPassword);
        studentDao.save(user);
        return "register_success";
    }

    public  String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(12));
    }





    // You can add more endpoints for updating, deleting, or getting specific students and teachers.
}
