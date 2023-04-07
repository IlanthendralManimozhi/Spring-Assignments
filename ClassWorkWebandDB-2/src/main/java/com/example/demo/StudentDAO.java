package com.example.demo;

/**
 * The StudentDAO interface is a Spring Data JPA repository that extends the JpaRepository interface for basic CRUD operations.
 * It provides methods to retrieve data from the database related to the Student entity.
 * */
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer> {
	/**
	 * Retrieves a list of students by their city.
	 * 
	 * @param scity the name of the city
	 * @return a list of students from the city
	 */
	public List<Student> findByScity(String scity);

	/**
	 * Retrieves a list of students whose age is greater than the given age.
	 * 
	 * @param sage the age to compare
	 * @return a list of students whose age is greater than the given age
	 */
	public List<Student> findBySageGreaterThan(int sage);

	/**
	 * Retrieves a list of students by their name.
	 * 
	 * @param sname the name of the student
	 * @return a list of students with the given name
	 */
	public List<Student> findBySname(String sname);

	/**
	 * Retrieves a sorted list of students by their city.
	 * 
	 * @param city the name of the city
	 * @return a sorted list of students from the city
	 */
	@Query("from Student where scity=?1 order by sname")
	public List<Student> findByScitySorted(String city);

}
