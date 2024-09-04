package org.nagul.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Students {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Roll_Num")
	int rollno;
	
	@Column(name="Student_Name")
	String name;
	
	@Column(name="Department")
	String department;

	public Students(String name, String department) {
		super();
		
		this.name = name;
		this.department = department;
	}

	public Students() {
		super();
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + ", department=" + department + "]";
	}
	
	

}
