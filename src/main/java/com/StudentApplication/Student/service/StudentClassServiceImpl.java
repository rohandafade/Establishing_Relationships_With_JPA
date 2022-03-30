package com.StudentApplication.Student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentApplication.Student.dao.StudentClassDao;
import com.StudentApplication.Student.entity.StudentClass;
@Service
public class StudentClassServiceImpl implements StudentClassService{

	@Autowired
	StudentClassDao studentClassDao;
	
	@Override
	public List<StudentClass> getStudentClass() {
		// TODO Auto-generated method stub
		return studentClassDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public StudentClass getStudentClassById(long studentClassId) {
		// TODO Auto-generated method stub
		return studentClassDao.getOne(studentClassId);
	}

	@Override
	public StudentClass addStudent(StudentClass studentClass) {
		// TODO Auto-generated method stub
		return studentClassDao.save(studentClass);
	}


}
