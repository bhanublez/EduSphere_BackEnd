
package com.service.EduSphere.model.teachers;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.List;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;  // Unique primary key

    @Override
    public String toString() {
        return "Teacher{" +
                "userId=" + userId +
                ", teacherId=" + teacherId +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", degree='" + degree + '\'' +
                ", medium='" + medium + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", aadharCardNumber='" + aadharCardNumber + '\'' +
                ", subjects=" + subjects +
                ", yearsOfExperience=" + yearsOfExperience +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", religion='" + religion + '\'' +
                ", category='" + category + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", casteName='" + casteName + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", district='" + district + '\'' +
                ", tempAddress='" + tempAddress + '\'' +
                ", permanentAddress='" + permanentAddress + '\'' +
                '}';
    }

    @NotNull
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @NotNull
    @Column(unique = true)
    private Long teacherId;  // Teacher-specific ID

    @NotNull
    private String name;

    @NotNull
    private String branch;

    @NotNull
    private String degree;

    @NotNull
    private String medium;

    @NotNull
    @Size(min = 10, max = 15, message = "Phone number must be between 10 and 15 characters")
    private String phoneNumber;

    @NotNull
    @Pattern(regexp = "\\d{12}", message = "Aadhar card number must be 12 digits")
    private String aadharCardNumber;

    @ElementCollection
    private List<String> subjects;  // List of subjects the teacher can teach

    private int yearsOfExperience;

    @NotNull
    private String dateOfBirth;

    private String religion;
    private String category;
    private String bloodGroup;
    private String casteName;

    private String country;

    private String state;
    private  String district;

    private String tempAddress;
    private  String permanentAddress;

    // Default constructor
    public Teacher() {
    }

    // Parameterized constructor


    // Getters and setters

    // Other methods

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAadharCardNumber() {
        return aadharCardNumber;
    }

    public void setAadharCardNumber(String aadharCardNumber) {
        this.aadharCardNumber = aadharCardNumber;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getCasteName() {
        return casteName;
    }

    public void setCasteName(String casteName) {
        this.casteName = casteName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getTempAddress() {
        return tempAddress;
    }

    public void setTempAddress(String tempAddress) {
        this.tempAddress = tempAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

}