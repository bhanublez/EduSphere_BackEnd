package com.service.EduSphere.model.teachers;

import com.service.EduSphere.model.students.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherDao { // Data Access Object
    @Autowired
    private TeacherRepository repository;

    public Teacher save(Teacher teacher) {
        return repository.save(teacher);
    }

    public void delete(Teacher teacher) {
        repository.delete(teacher);
    }

    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        Streamable.of(repository.findAll()).forEach(teachers::add);
        return teachers;
    }
    public Teacher findByUserId(long l) {
        return repository.findById(l).orElse(null);
    }

    public Optional<Student> findByEmailAddress(String s) {
        return repository.findByEmail(s);
    }
    public Optional<Student> findByAdharCardNumber(String s) {
        return repository.findByAdharCardNumber(s);
    }

    public Optional<Student> findByUserPanCard(String s) {
        return repository.findByUserPanCard(s);
    }

    public String findUserPass(Long l) {
        return repository.findUserPass(l);
    }



}
