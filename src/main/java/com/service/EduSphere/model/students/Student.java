package com.service.EduSphere.model.students;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.UniqueElements;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;  // Unique primary key

    @NotNull
    @Column(unique = true)
    private Long enrollmentNumber;

    @NotNull
    private String name;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotNull
    private String password;

    @Override
    public String toString() {
        return "Student{" +
                "userId=" + userId +
                ", enrollmentNumber=" + enrollmentNumber +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", degree='" + degree + '\'' +
                ", semester=" + semester +
                ", section='" + section + '\'' +
                ", medium='" + medium + '\'' +
                ", admissionDate='" + admissionDate + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
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
                ", gender='" + gender + '\'' +
                ", adharCardNumber='" + adharCardNumber + '\'' +
                ", panCardNumber='" + panCardNumber + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", fatherMobileNumber='" + fatherMobileNumber + '\'' +
                ", fatherEmailAddress='" + fatherEmailAddress + '\'' +
                '}';
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @NotNull
    private String branch;
    @NotNull
    private String degree;
    @NotNull
    private int semester;
    @NotNull
    private String section;
    private String medium;
    private String admissionDate;
    private String fatherName;
    private String motherName;
    private String dateOfBirth;
    private String religion;
    private String category;
    private String bloodGroup;
    private String casteName;

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

    private String country;

    private String state;
    private  String district;

    private String tempAddress;
    private  String permanentAddress;
    @NotNull
    @Pattern(regexp = "^(Male|Female)$", message = "Gender must be either 'Male' or 'Female'")
    private String gender;

    @Column(unique = true)
    @Pattern(regexp = "\\d{12}", message = "Aadhar card number must be 12 digits")
    private String adharCardNumber;
    @Column(unique = true)
    private String panCardNumber;
    @NotNull
    @Size(min = 10, max = 15, message = "Phone number must be between 10 and 15 characters")
    private String mobileNumber;
    @Column(unique = true)
    private String emailAddress;
    @Size(min = 10, max = 15, message = "Phone number must be between 10 and 15 characters")
    private String fatherMobileNumber;
    private String fatherEmailAddress;

    // Constructors, getters, setters, and other methods

    public Long getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(Long enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
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

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdharCardNumber() {
        return adharCardNumber;
    }

    public void setAdharCardNumber(String adharCardNumber) {
        this.adharCardNumber = adharCardNumber;
    }

    public String getPanCardNumber() {
        return panCardNumber;
    }

    public void setPanCardNumber(String panCardNumber) {
        this.panCardNumber = panCardNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFatherMobileNumber() {
        return fatherMobileNumber;
    }

    public void setFatherMobileNumber(String fatherMobileNumber) {
        this.fatherMobileNumber = fatherMobileNumber;
    }

    public String getFatherEmailAddress() {
        return fatherEmailAddress;
    }

    public void setFatherEmailAddress(String fatherEmailAddress) {
        this.fatherEmailAddress = fatherEmailAddress;
    }


}


