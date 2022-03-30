package com.StudentApplication.Student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentApplication.Student.dao.StudentDao;
import com.StudentApplication.Student.entity.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> getstudent() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}
	
	
	@SuppressWarnings("deprecation")
	@Override
	public Student getstudents(long studentId) {
		// TODO Auto-generated method stub
		return studentDao.getOne(studentId);
	}


	@Override
	public Student addstudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.save(student);
	}


	


	

	


	


	



	
}
