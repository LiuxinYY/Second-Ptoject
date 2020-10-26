package com.sch.lx.cn;

public class Course {
	private int cnumber;
	private String cname;
	private String  adress;
	private String teacher;
	private String time;
	public Course(int cnumber, String cname, String adress, String teacher,
			String time) {
		super();
		this.cnumber = cnumber;
		this.cname = cname;
		this.adress = adress;
		this.teacher = teacher;
		this.time = time;
	}
	public Course() {
		super();
	}
	public int getCnumber() {
		return cnumber;
	}
	public void setCnumber(int cnumber) {
		this.cnumber = cnumber;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "[课程编号：" + cnumber + "|课程名字:" + cname + "|上课地点:"
				+ adress + "|任课教师:" + teacher + "|上课时间:" + time + "]";
	}
	
}
