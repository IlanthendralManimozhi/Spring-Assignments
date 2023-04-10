package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This class represents a Student entity, which is stored in a database table.
 * It has properties for the student's ID, name, age, and city.
 */
@Entity
public class Student {
	@Id
	private int studentId; // The student's ID
	private String studentName; // The student's name
	private int studentAge; // The student's age
	private String studentCity; // The student's city

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	// Getter and setter methods for the properties

}
