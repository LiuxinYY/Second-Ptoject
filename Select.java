 package com.sch.lx.cn;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实例化对象
		Student s1=new Student(1,"杨洋",false,13);
		Course c1=new Course(5555, "Java", "教室306", "张老师", "15:00");
		Course c2=new Course();
		Teacher t1=new Teacher(33, "张老师", false, 30);
//		s1.setCourse(c2);
		s1.setCourse(c1);
		t1.setCourse(c1);
		s1.setTea(t1);
//		判断学生是否退课
		if(s1.getC().getCnumber()==0){
			System.out.println(s1.show()+"\n该学生已经退课");
		}else
			System.out.println(s1.toString());
//		System.out.println(s1.getC());
//		System.out.println(c1.toString());
//		System.out.println(t1.toString());
//		t1.show();
		
	}

}
