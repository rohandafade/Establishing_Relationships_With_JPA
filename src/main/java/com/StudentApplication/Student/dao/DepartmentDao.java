package com.StudentApplication.Student.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentApplication.Student.entity.Department;

public interface DepartmentDao extends JpaRepository<Department, Long>{

}
