package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentServiceInter sss;

	
	public StudentServiceInter getSss() {
		return sss;
	}
	public void setSss(StudentServiceInter sss) {
		this.sss = sss;
	}
	@RequestMapping(value="getStudent/{id}",method=RequestMethod.GET)
	public Student getStudent(@PathVariable int id) {
		Student student=sss.getStudentById(id);
		return student;
	}
	@RequestMapping(value="getStudentbyId",method=RequestMethod.POST)
	public Student getStudentById(@RequestBody int id) {
		Student student=sss.getStudentById(id);
		return student;
	}
	@RequestMapping(value="getStudentAll",method=RequestMethod.POST)
	public List getStudentAll() {
		List<Student> list=sss.getAllStudent();
		return list;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="createstudent")
	public ModelAndView setStudent(ModelAndView mandv) {
		Student student=new Student();
		mandv.addObject("student",student);
		mandv.setViewName("form");
		return mandv;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="createstudent")
	public void setStudent(Student student) {
		sss.studentCreater(student);
	}
			
	}

