package com.sch.lx.cn;

public class People {
	private int number;
	private String name;
	private Boolean  sex;
	private int age;
	public People(int number, String name, Boolean sex, int age) {
		super();
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public People() {
		super();
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getSex() {
		return sex;
	}
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
//		确认人员性别
		if(sex==true){
		return "People [编号" + number + ", 名字" + name + ", 性别" + "女"
				+ ", 年龄" + age + "]";
		}else
			return "[编号" + number + ", 名字" + name + ", 性别" + "男"
					+ ", 年龄" + age + "]";
	}
	
}
