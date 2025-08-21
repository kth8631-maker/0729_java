package com.kh.hw.person.model.vo;

public class Student extends Person {
	
	private int grade;
	private String major;
	
	public Student() {
		super();
	}
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
	}
	
	public int getGrade() {
		return grade;
	}
	public String getMajor() {
		return major;
	}
	
	public void setGrade() {
		this.grade = grade;
	}
	public void setMajor() {
		this.major = major;
	}
	
	public String toString() {
		return "학년 : " + grade + ", 전공 : " + major;
	}
	

}
