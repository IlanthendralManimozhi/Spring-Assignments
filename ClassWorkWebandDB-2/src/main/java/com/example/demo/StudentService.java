package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * This class is responsible for handling the business logic for the Student
 * entity.
 */
@Service("studentService")
@Transactional
public class StudentService implements StudentServiceInterface {

	@Autowired
	private StudentDAO dao;

	/**
	 * Saves the given student object to the database.
	 * 
	 * @param student The student object to be saved.
	 */
	public void studentCreater(Student student) {
		dao.save(student);
	}

	/**
	 * Retrieves all the students from the database.
	 * 
	 * @return A list of all the students.
	 */
	public List<Student> getAllStudent() {
		List<Student> list = dao.findAll();
		return list;
	}

	/**
	 * Retrieves a student by the given id.
	 * 
	 * @param id The id of the student to be retrieved.
	 * @return The student object with the given id.
	 */
	public Student getStudentById(int studentId) {
		Optional<Student> optional = dao.findById(studentId);
		Student student = optional.get();
		return student;
	}

	/**
	 * Retrieves a list of students by the given city.
	 * 
	 * @param scity The name of the city to search for.
	 * @return A list of students from the given city.
	 */
	public List<Student> byCity(String studentCity) {
		List<Student> list = dao.findByStudentCity(studentCity);
		return list;
	}

	/**
	 * Retrieves a list of students whose age is greater than the given value.
	 * 
	 * @param sage The minimum age value to search for.
	 * @return A list of students whose age is greater than the given value.
	 */
	public List<Student> greaterAge(int studentAge) {
		List<Student> list = dao.findByStudentAgeGreaterThan(studentAge);
		return list;
	}

	/**
	 * Retrieves a list of students from the given city, sorted by their name.
	 * 
	 * @param scity The name of the city to search for.
	 * @return A list of students from the given city, sorted by their name.
	 */
	public List<Student> sortCity(String studentCity) {
		List<Student> list = dao.findByStudentCityOrderByStudentNameAsc(studentCity);
		return list;
	}
}
