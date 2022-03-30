package com.StudentApplication.Student.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentApplication.Student.entity.Student;

public interface StudentDao extends JpaRepository<Student,Long>{
	
	

}
