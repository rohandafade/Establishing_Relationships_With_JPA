package com.StudentApplication.Student.service;

import java.util.List;

import com.StudentApplication.Student.entity.Department;

public interface DepartmentService {

	List<Department> getDepartment();

	Department getDepartmentById(long departmentId);

	Department addDepartment(Department department);

}
