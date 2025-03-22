package org.exapmle.edu.controller;

import org.exapmle.edu.model.Student;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    private List<Student> studentList = new ArrayList<>();
}
