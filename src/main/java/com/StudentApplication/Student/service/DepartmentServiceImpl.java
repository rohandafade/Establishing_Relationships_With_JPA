package com.StudentApplication.Student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentApplication.Student.dao.DepartmentDao;
import com.StudentApplication.Student.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	DepartmentDao departmentDao;
	
	@Override
	public List<Department> getDepartment() {
		// TODO Auto-generated method stub
		return departmentDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Department getDepartmentById(long departmentId) {
		// TODO Auto-generated method stub
		return departmentDao.getOne(departmentId);
	}

	@Override
	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentDao.save(department);
	}

	
}
