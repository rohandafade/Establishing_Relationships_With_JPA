package com.StudentApplication.Student.service;

import java.util.List;

import com.StudentApplication.Student.entity.StudentClass;

public interface StudentClassService {

	

	StudentClass addStudent(StudentClass studentClass);

	List<StudentClass> getStudentClass();

	StudentClass getStudentClassById(long studentClassId);

	

	
}
