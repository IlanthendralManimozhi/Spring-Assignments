package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentServiceInterface studentService;

	// Getter and setter methods for StudentServiceInter
	public StudentServiceInterface getSss() {
		return studentService;
	}
	public void setSss(StudentServiceInterface studentService) {
		this.studentService = studentService;
	}

	// Get a student by ID
	@RequestMapping(value="getStudent/{id}",method=RequestMethod.GET)
	public Student getStudent(@PathVariable int id) {
		Student student=studentService.getStudentById(id);
		return student;
	}

	// Get a student by ID using POST method and request body
	@RequestMapping(value="getStudentbyId",method=RequestMethod.POST)
	public Student getStudentById(@RequestBody int id) {
		Student student=studentService.getStudentById(id);
		return student;
	}

	// Get all students
	@RequestMapping(value="getStudentAll",method=RequestMethod.POST)
	public List<Student> getStudentAll() {
		List<Student> list=studentService.getAllStudent();
		return list;
	}

	// Display a form to create a new student
	@RequestMapping(method=RequestMethod.GET,value="createstudent")
	public ModelAndView setStudent(ModelAndView modelAndView) {
		Student student=new Student();
		modelAndView.addObject("student",student);
		modelAndView.setViewName("form");
		return modelAndView;
	}

	// Create a new student using POST method and request body
	@RequestMapping(method=RequestMethod.POST,value="createstudent")
	public void setStudent(Student student) {
		studentService.studentCreater(student);
	}

	// Get a list of students by city
	@RequestMapping(method = RequestMethod.POST, value = "studentCity")
	public List<Student> studentBycity(@RequestBody String studentCity) {
		List<Student> list = studentService.byCity(studentCity);
		return list;
	}

	// Get a list of students greater than a certain age
	@RequestMapping(method = RequestMethod.POST, value = "studentByAge")
	public List<Student> studentByage(@RequestBody int studentAge) {
		List<Student> list = studentService.greaterAge(studentAge);
		return list;
	}

	// Get a sorted list of students by city
	@RequestMapping(method = RequestMethod.POST, value = "studentByCity")
	public List<Student> studentBycitySorted(@RequestBody String studentCity) {
		List<Student> list = studentService.sortCity(studentCity);
		return list;
	}
}
