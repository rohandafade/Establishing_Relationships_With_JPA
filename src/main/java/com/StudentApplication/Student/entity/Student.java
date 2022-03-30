package com.StudentApplication.Student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="StudentTable")
public class Student {

	@Id
	@GeneratedValue
	@Column(name="Student_Id")
	private long studentId;
	
	@Column(name="Student_Name")
	private String studentName;
	
	@ManyToOne
	private StudentClass studentClass;
	
	@ManyToOne
	private Department department;
	
	public Student() {
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public StudentClass getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(StudentClass studentClass) {
		this.studentClass = studentClass;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Student(long studentId, String studentName, StudentClass studentClass, Department department) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.department = department;
	}

	
	
	
	
	
}
