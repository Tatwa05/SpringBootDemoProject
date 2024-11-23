package com.klef.jfsd.springboot;

public class Student 
{
	private int id;	
	private String name;
	private String gender;
	private double age;
	
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public Student(int id, String name, String gender, double age) 
	{
		//super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	
}