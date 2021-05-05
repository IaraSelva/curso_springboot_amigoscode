package com.amigoscode.amigoscode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amigoscode.amigoscode.model.Student;
import com.amigoscode.amigoscode.service.StudentService;

@RestController
@RequestMapping("/student")

public class StudentController {
	
	private final StudentService studentService;
	
	@Autowired
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;

	}

	@GetMapping
	public List<Student> getStudent(){
		return studentService.getStudent();
	}
	
	@PostMapping
	public void registrerNewStudent(@RequestBody Student student) {
		studentService.addNewStudent(student);
	}

}
