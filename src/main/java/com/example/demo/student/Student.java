package com.example.demo.student;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Student { //This class contains all information that we want to serve in API's endpoint and afterwards it will be manipulated by using API Layer.
    @Id
    @SequenceGenerator(name="student_sequence", sequenceName ="student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")

    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(Long id, String name, String email, LocalDate dob, Integer age) {
        this.setId(id);
        this.setName(name);
        this.setEmail(email);
        this.setDob(dob);
        this.setAge(age);
    }

    public Student(String name, String email, LocalDate dob, Integer age) {
        this.setName(name);
        this.setEmail(email);
        this.setDob(dob);
        this.setAge(age);
    }

}