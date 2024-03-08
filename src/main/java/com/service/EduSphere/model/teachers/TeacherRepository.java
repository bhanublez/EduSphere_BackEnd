package com.service.EduSphere.model.teachers;

import com.service.EduSphere.model.students.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    // Additional custom queries can be added here if needed
    @Query("SELECT s FROM Student s WHERE s.emailAddress = :email")
    Optional<Student> findByEmail(String email);
    @Query("SELECT s FROM Student s WHERE s.adharCardNumber = :adharCardNumber")
    Optional<Student> findByAdharCardNumber(String adharCardNumber);
    @Query("SELECT s FROM Student s WHERE s.panCardNumber = :userPanCard")
    Optional<Student> findByUserPanCard(String userPanCard);

    @Query("SELECT s.password FROM Student s WHERE s.userId = :userId")
    String findUserPass(Long userId);

}
