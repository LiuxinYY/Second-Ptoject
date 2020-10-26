package com.sch.lx.cn;

public class Student extends People{
	private Teacher tea;
	private Course c;
	public Student(int number, String name, Boolean sex, int age) {
		super(number, name, sex, age);
	}
	
	public Teacher getTea() {
		return tea;
	}

	public void setTea(Teacher tea) {
		this.tea = tea;
	}

	public void setC(Course c) {
		this.c = c;
	}

	public Course getC() {
		if(c==null){
			return null;
		}
		return c;
	}

	public void setCourse(Course c) {
		this.c = c;
	}

	@Override
	public String toString() {
//		判断教师是否教授此门课程
		if(tea.getName()==c.getTeacher()){
			return "学生："+super.toString()+"\n所选课程" +c+"\n教师信息"+tea;
		}else
			return "学生："+super.toString()+"\n所选课程" +c;		
	}
	public String show(){
		return "学生："+super.toString();
		
	}
	

}
