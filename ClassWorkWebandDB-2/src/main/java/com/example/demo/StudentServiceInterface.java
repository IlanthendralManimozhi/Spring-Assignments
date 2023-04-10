package com.example.demo;

import java.util.List;

/**
 * This interface defines the methods that must be implemented by the
 * StudentService class.
 */
public interface StudentServiceInterface {
	/**
	 * Saves the given student object to the database.
	 * 
	 * @param student The student object to be saved.
	 */
	public void studentCreater(Student student);

	/**
	 * Retrieves all the students from the database.
	 * 
	 * @return A list of all the students.
	 */
	public List getAllStudent();

	/**
	 * Retrieves a student by the given id.
	 * 
	 * @param id The id of the student to be retrieved.
	 * @return The student object with the given id.
	 */
	public Student getStudentById(int studentId);

	/**
	 * Retrieves a list of students by the given city.
	 * 
	 * @param scity The name of the city to search for.
	 * @return A list of students from the given city.
	 */
	public List<Student> byCity(String studentCity);

	/**
	 * Retrieves a list of students whose age is greater than the given value.
	 * 
	 * @param sage The minimum age value to search for.
	 * @return A list of students whose age is greater than the given value.
	 */
	public List<Student> greaterAge(int studentAge);

	/**
	 * Retrieves a list of students from the given city, sorted by their name.
	 * 
	 * @param scity The name of the city to search for.
	 * @return A list of students from the given city, sorted by their name.
	 */
	public List<Student> sortCity(String studentCity);
}
