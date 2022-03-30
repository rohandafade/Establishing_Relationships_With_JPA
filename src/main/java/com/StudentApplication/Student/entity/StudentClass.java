package com.StudentApplication.Student.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="StudentClass")
public class StudentClass {

	
	@Id
	@GeneratedValue
	@Column(name="StudentClass_Id")
	private long studentClassId;
	
	@Column(name="StudentClass_Name")
	private String studentClassName;

	@OneToMany(mappedBy = "studentClass")
	private List<Student>Students;
	
	public StudentClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getStudentClassId() {
		return studentClassId;
	}

	public void setStudentClassId(long studentClassId) {
		this.studentClassId = studentClassId;
	}

	public String getStudentClassName() {
		return studentClassName;
	}

	public void setStudentClassName(String studentClassName) {
		this.studentClassName = studentClassName;
	}

	public List<Student> getStudents() {
		return Students;
	}

	public void setStudents(List<Student> students) {
		Students = students;
	}

	public StudentClass(long studentClassId, String studentClassName, List<Student> students) {
		super();
		this.studentClassId = studentClassId;
		this.studentClassName = studentClassName;
		Students = students;
	}

	
	
	
}
