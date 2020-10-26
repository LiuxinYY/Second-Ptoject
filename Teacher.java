package com.sch.lx.cn;

public class Teacher extends People{
	private Course c;
	public Teacher(int number, String name, Boolean sex, int age) {
		super(number, name, sex, age);
		
	}
	public Course getC() {
		return c;
	}
	public void setCourse(Course c) {
		this.c = c;
	}
//	public void show(){
//		System.out.println(c);
//	}
	@Override
	public String toString(){
		return super.toString();		
	}
	
}
