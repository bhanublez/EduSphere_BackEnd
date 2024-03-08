package com.service.EduSphere.model.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentDao { // Data Access Object
    @Autowired
    private StudentRepository repository;

    public Student save(Student student) {
        return repository.save(student);
    }

    public void delete(Student student) {
        repository.delete(student);
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        Streamable.of(repository.findAll()).forEach(students::add);
        return students;
    }


    public Student findByUserId(long l) {
        return repository.findById(l).orElse(null);
    }


    public Optional<Student> findByEmailAddress(String s) {
        return repository.findByEmail(s);
    }
//
    public Optional<Student> findByAdharCardNumber(String s) {
        return repository.findByAdharCardNumber(s);
    }

    public Optional<Student> findByUserPanCard(String s) {
        return repository.findByUserPanCard(s);
    }

    public String findUserPass(Long l) {
        return repository.findUserPass(l);
    }

//    public Optional<Student> findByEnrollmentNumber(Long l) {
//        return repository.findByEnrollmentNumber(l);
//    }


}
