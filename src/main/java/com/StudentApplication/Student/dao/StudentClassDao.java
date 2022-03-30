package com.StudentApplication.Student.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentApplication.Student.entity.StudentClass;

public interface StudentClassDao extends JpaRepository<StudentClass,Long>{

}
