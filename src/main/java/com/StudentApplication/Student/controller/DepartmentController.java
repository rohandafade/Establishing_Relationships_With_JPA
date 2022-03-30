package com.StudentApplication.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.StudentApplication.Student.entity.Department;
import com.StudentApplication.Student.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	
	@RequestMapping(value="getDepartment",method= RequestMethod.GET)
	public List<Department>getDepartment(){
		
		return this.departmentService.getDepartment();
	}
	
	@RequestMapping(value="getDepartment/{DepartmentId}",method= RequestMethod.GET)
	public Department getDepartmentById(@PathVariable long DepartmentId) {
		return this.departmentService.getDepartmentById(DepartmentId);
	}
	
	@RequestMapping(value="addDepartment",method= RequestMethod.POST)
	public Department addDepartment(@RequestBody Department department) {
		return this.departmentService.addDepartment(department);
		
	}
}
