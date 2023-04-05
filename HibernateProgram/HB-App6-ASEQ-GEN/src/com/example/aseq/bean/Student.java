package com.example.aseq.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "college")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="student_seq")
	@GenericGenerator(name="student_seq",strategy="com.example.aseq.gen.id.StudentNumberGenerator")
	@Column(name = "SID")
	private int id;
	
	@Column(name = "SNAME")
	private String name;
	
	@Column(name = "COURSE")
	private String course;
	
	@Column(name = "FEES")
	private double fees;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", fees=" + fees + "]";
	}
	
}
