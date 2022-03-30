package com.StudentApplication.Student.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department {

	@Id
	@GeneratedValue
	@Column(name="Department_Id")
	private long departmentID;
	
	@Column(name="Department_Name")
	private String departmentName;

	@OneToMany(mappedBy = "department")
	private List<Student>Students;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(long departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Student> getStudents() {
		return Students;
	}

	public void setStudents(List<Student> students) {
		Students = students;
	}

	public Department(long departmentID, String departmentName, List<Student> students) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		Students = students;
	}

	
	
	
	
}
