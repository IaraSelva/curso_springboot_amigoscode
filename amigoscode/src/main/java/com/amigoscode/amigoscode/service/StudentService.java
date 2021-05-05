package com.amigoscode.amigoscode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.amigoscode.amigoscode.model.Student;
import com.amigoscode.amigoscode.repository.StudentRepository;


@Service
public class StudentService {
	
	private final StudentRepository studentRepository;
	
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	public List<Student> getStudent(){
		return studentRepository.findAll();
	}
	
	public void addNewStudent(Student student) {
		System.out.println(student);
		
	}
}
