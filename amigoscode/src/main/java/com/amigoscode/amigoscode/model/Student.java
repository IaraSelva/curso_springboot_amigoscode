package com.amigoscode.amigoscode.model;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String email;
	
	private LocalDate birth;
	
	@Transient
	private int age;
	
	
	public Student(String name, String email, LocalDate birth) {
		super();
		this.name = name;
		this.email = email;
		this.birth = birth;

	}
	public Student(long id, String name, String email, LocalDate birth) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.birth = birth;

	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public LocalDate getBirth() {
		return birth;
	}
	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public Integer setAge(int age) {
		return Period.between(this.birth, LocalDate.now()).getYears();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", "
				+ "name=" + name + ", "
				+ "email=" + email + ", "
				+ "birth=" + birth + ", "
				+ "age=" + age + "]";
	}
	
	
}
