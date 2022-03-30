package com.StudentApplication.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.StudentApplication.Student.entity.StudentClass;
import com.StudentApplication.Student.service.StudentClassService;

@RestController
public class StudentClassController {

	
	@Autowired
	StudentClassService StudentClassService;
	
	@RequestMapping(value="getStudentClass",method= RequestMethod.GET)
	public List<StudentClass> getStudentClass(){
		return this.StudentClassService.getStudentClass();
		
	}
	
	@RequestMapping(value="getStudentClass/{StudentClassId}",method= RequestMethod.GET)
	public StudentClass getStudentClassById(@PathVariable long StudentClassId) {
		return this.StudentClassService.getStudentClassById(StudentClassId);
	}
	
	@RequestMapping(value="addStudentClass",method= RequestMethod.POST)
	public StudentClass addStudent(@RequestBody StudentClass studentClass) {
		return this.StudentClassService.addStudent(studentClass);
		
	}
	
}
