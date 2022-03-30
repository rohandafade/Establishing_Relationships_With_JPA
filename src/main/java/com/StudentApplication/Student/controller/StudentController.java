package com.StudentApplication.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.StudentApplication.Student.entity.Student;
import com.StudentApplication.Student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "getstudent",method = RequestMethod.GET)

	public List<Student> getstudent(){
		return this.studentService.getstudent();
		
	}	
	
	@RequestMapping(value = "getstudent/{studentId}",method = RequestMethod.GET)
	public Student getstudents(@PathVariable long studentId) {
		return  this.studentService.getstudents(studentId);		
	}
	
	@RequestMapping(value = "addstudent",method = RequestMethod.POST)
	public Student addstudent(@RequestBody Student student) {
		return this.studentService.addstudent(student);
		
	}
	
}
