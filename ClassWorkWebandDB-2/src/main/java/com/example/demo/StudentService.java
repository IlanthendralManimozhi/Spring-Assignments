package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service("ss")
@Transactional
public class StudentService implements StudentServiceInter{
	@Autowired
	private StudentDAO dao;
	public void studentCreater(Student student) {
		dao.save(student);
	}
	public List getAllStudent() {
		List<Student> list=dao.findAll();
		return list;
	}
	public Student getStudentById(int id) {
		Optional<Student> opt=dao.findById(id);
		Student student=opt.get();
		return student;		
	}
}
