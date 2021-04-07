package com.example.demo.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /* This annotation means that class will be interpreted as a Restful API */
@RequestMapping(path = "api/v1/student") // This annotation is used to create a route to serve our endpoint

public class StudentController {

    private final StudentService studentService; //This a reference for a service class

    @Autowired //This annotation is used when we work with Beans, it is responsible give to Spring responsability of manage our Class instances (Beans).
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping /* This annotation makes this method serves data as API's Endpoint */
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}
