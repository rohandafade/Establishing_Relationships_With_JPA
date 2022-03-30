package com.StudentApplication.Student.service;

import java.util.List;

import com.StudentApplication.Student.entity.Student;

public interface StudentService {

	public List<Student> getstudent();


	public Student getstudents(long studentId);


	public Student addstudent(Student student);

;




}
