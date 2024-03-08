package com.service.EduSphere;

import com.service.EduSphere.model.students.Student;
import com.service.EduSphere.model.students.StudentDao;
import com.service.EduSphere.model.teachers.Teacher;
import com.service.EduSphere.model.teachers.TeacherDao;
import org.junit.jupiter.api.Test;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class EduSphereApplicationTests {

	@Autowired
	private StudentDao studentDao;


//
//	@Test
//	void contextLoads() {
//
//	}

//Working
//	@Test
//	void addUniqueStudent() {
//		// Arrange
//		Student student = new Student();
//		student.setUserId(77L);
//		student.setEnrollmentNumber(127994L);
//		student.setName("Laru");
//		student.setBranch("Science");
//		student.setDegree("B.Tecah");
//		student.setSemester(9);
//		student.setSection("Bs");
//		student.setMedium("English");
//		student.setAdmissionDate("2022-02-15");
//		student.setFatherName("John Doe");
//		student.setMotherName("Carol Doe");
//		student.setDateOfBirth("1998-05-20");
//		student.setReligion("Christian");
//		student.setCategory("OBC");
//		student.setBloodGroup("B+");
//		student.setCasteName("ABC");
//		student.setCountry("USA");
//		student.setState("California");
//		student.setDistrict("Los Angeles");
//		student.setTempAddress("Temporary Address 2");
//		student.setPermanentAddress("Permanent Address 2");
//		student.setGender("Female");
//		student.setAdharCardNumber("120456788012");
//		student.setPanCardNumber("ABDDE1234F");
//		student.setMobileNumber("98769543210");
//		student.setEmailAddress("vabua@gmail.com");
//		student.setFatherMobileNumber("8766492101");
//		student.setFatherEmailAddress("joada@example.com");
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		String encodedPassword = passwordEncoder.encode("Raja123");
//		//Hashing for more security
////		encodedPassword= hashPassword(encodedPassword);
//		student.setPassword(encodedPassword);
//		studentDao.save(student);
//	}
//	public  String hashPassword(String password) {
//		return BCrypt.hashpw(password, BCrypt.gensalt(12));
//	}


	//Working
//	@Test
//	void getAllEmployee(){
//		List<Student> st=studentDao.getAllStudents();
//		System.out.println(st);
//	}


//	Working
//	@Test
//	void getAllEmployeeAndDelete(){
//		List<Student> st=studentDao.getAllStudents();
//		for(Student employee:st){
//			studentDao.delete(employee);
//		}
//	}


//Teacher teasting
//@Autowired
//private TeacherDao teacherDao;
////
//    @Test
//    void addTeacher() {
//        // Arrange
//        Teacher teacher = new Teacher();
//        teacher.setUserId(2L);
//        teacher.setTeacherId(101L);
//        teacher.setName("Pinku");
//        teacher.setBranch("Science");
//        teacher.setDegree("Ph.D.");
//        teacher.setMedium("English");
//        teacher.setPhoneNumber("9876543210");
//        teacher.setAadharCardNumber("123456789012");
//        teacher.setSubjects(Arrays.asList("Physics", "Mathematics"));
//        teacher.setYearsOfExperience(5);
//        teacher.setDateOfBirth("1980-01-15");
//        teacher.setReligion("Christian");
//        teacher.setCategory("General");
//        teacher.setBloodGroup("A+");
//        teacher.setCasteName("XYZ");
//        teacher.setCountry("USA");
//        teacher.setState("California");
//        teacher.setDistrict("Los Angeles");
//        teacher.setTempAddress("Temporary Address");
//        teacher.setPermanentAddress("Permanent Address");
//        teacherDao.save(teacher);
//    }

//	@Test
//	public void testFindByUserId(){
//		Student student = studentDao.findByUserId(1L);
//		System.out.println("Mil gaya"+student);
//	}

//	@Test
//	public void testFindByEmail() {
//		Student student = studentDao.findByEmailAddress("alicea@example.com").orElse(null);
//		System.out.println("Mil gaya"+student);
//	}

	//Getting Hashed Password
//	@Test
//	public void testPassword() {
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		String plainPassword = "Raja123";
//		String encodedPassword = passwordEncoder.encode(plainPassword);
//		System.out.println("Encoded Password"+encodedPassword);
//
//		//Decoding
//		boolean isPasswordMatch = BCrypt.checkpw(plainPassword, encodedPassword);
//		System.out.println("Password Matched"+isPasswordMatch);
//	}

//	@Test
//	public void testFindPass(){
//		String pass=studentDao.findUserPass(4L);
//		System.out.print("hased Pass"+pass +" OK");
//		//HeHashing and then Decoding
//		boolean isPasswordMatch = BCrypt.checkpw("Raja123", pass);
//		System.out.println("Password Matched"+isPasswordMatch);
//	}

}
