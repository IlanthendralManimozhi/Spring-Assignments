package com.example.demo;

import java.util.List;

public interface StudentServiceInter {
	public void studentCreater(Student student);

	public List getAllStudent();

	public Student getStudentById(int id);
}
