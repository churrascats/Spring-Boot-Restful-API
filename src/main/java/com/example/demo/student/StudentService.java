package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service //This annotation means this class is a Bean which stereotype is service.
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(1L, "Igor", "igorsb11@hotmail.com", LocalDate.of(1997, Month.JULY, 18), 21));
    }
}
