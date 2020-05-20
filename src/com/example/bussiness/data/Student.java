package com.example.bussiness.data;

public class Student {
	
	private int rolNo;
	private String name;
	private String gender;
	
	private int maths;
	private int physics;
	private int english;
	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rolNo + ", name=" + name + ", gender=" + gender + ", math=" + maths + ", physics="
				+ physics + ", english=" + english + "]";
	}
	
	public int getRolNo() {
		return rolNo;
	}
	public void setRolNo(int rolNo) {
		this.rolNo = rolNo;
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
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rolNo, String name, String gender, int maths, int physics, int english) {
		super();
		this.rolNo = rolNo;
		this.name = name;
		this.gender = gender;
		this.maths = maths;
		this.physics = physics;
		this.english = english;
	}
	
	
	
	
	

}
