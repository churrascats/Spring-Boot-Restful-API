package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(1L, "Igor", "igorsb11@hotmail.com", LocalDate.of(1997, Month.JULY, 18), 21));
    }
}
