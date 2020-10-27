# Second-Ptoject
# 计G201 刘馨 2020322069 
# 一、实验目的
1. 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
2. 掌握面向对象的类设计方法（属性、方法）；
3. 掌握类的继承用法，通过构造方法实例化对象；
4. 学会使用super()，用于实例化子类；
5. 掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
# 二、实验要求
1. 编写person、student、teacher、course实体类以及测试主类test（注意类之间继承关系的适用）
2. 在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。
# 三、实验过程
1. 创建父类Person人员封装类
    - 类中定义number,  name, sex, age四个变量,分别表示人员编号、姓名、性别、年龄。使用set方法设置参数,设置get方法获取参数
    - 用super创建有参构造方法和无参构造方法，使用使用Object根类的toString（）方法打印人员基本信息，并在打印输出方法中使用if（）else判断人员性别
2. 创建Course封装类
    - 在类中定义 cnumber,  cname, adress, teacher,time五变量,分别表示课程编号、课程名、上课地点、授课教师、上课时间。使用set方法设置参数。设置get方法获取参数，
    - 使用super创建有参构造方法和无参构造方法，使用使用Object根类的toString（）方法打印课程基本信息
3. 创建子类Teacher教师类继承父类Person类
    - 在类中定义Course类型的属性变量，使用set方法设置参数。设置get方法获取参数
    - 使用super调用父类中的构造方法，使用使用Object根类的toString（）方法打印课程基本信息
4. 创建子类Student学生类继承父类Person类
    - 在类中定义Course类型的属性变量和Teacher类型的属性变量，使用set方法设置参数。设置get方法获取参数
    - 使用super调用父类中的构造方法，使用使用Object根类的toString（）方法打印课程基本信息
5. 创建Select测试类
    - 实例化学生Student对象、教师Teacher对象、课程Course对象
    - 为学生对象添加选课信息，为老师设置选课信息
    - 判断学生是否选课，并打印输出
6. 添加内容
    - 实现一门课程只由一门老师教授：在学生封装类中，判断教师是否教授此门课程，若教授，输出教师信息，若不教授，则只输出学生选课信息
# 四、核心代码
1. 有参和无参构造方法
```
	//有参构造方法
	public People(int number, String name, Boolean sex, int age) {
		super();
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
//	无参构造方法
	public People() {
		super();
	}
```
2. Object根类的toString（）方法
```
//	Object根类的toString（）方法,判断Boolean类型的男女性别
	public String toString() {
		if(sex==true){
		return "People [编号" + number + ", 名字" + name + ", 性别" + "女"
				+ ", 年龄" + age + "]";
		}else
			return "[编号" + number + ", 名字" + name + ", 性别" + "男"
					+ ", 年龄" + age + "]";
	}
```
3. 使用super调用父类中的构造方法
```
//	使用super调用父类中的构造方法
	public Student(int number, String name, Boolean sex, int age) {
		super(number, name, sex, age);
	}
```
4. 实现一门课程只由一门老师教授
```
//实现一门课程只由一门老师教授
	@Override
	public String toString() {
		if(tea.getName()==c.getTeacher()){
			return "学生："+super.toString()+"\n所选课程" +c+"\n教师信息"+tea;
		}else
			return "学生："+super.toString()+"\n所选课程" +c;		
	}
	public String show(){
		return "学生："+super.toString();
		 
	}
```
5. 实例化对象
```
//		实例化对象（有参）
		Student s1=new Student(1,"杨洋",false,13);
		Course c1=new Course(5555, "Java", "教室306", "张老师", "15:00");
//		实例化对象 （无参）
		Course c2=new Course();
		Teacher t1=new Teacher(33, "张老师", false, 30);
```
6. 设置和获取对象成员值
```
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
```
6. 变量赋值
```
//		为变量赋值
//		s1.setCourse(c2);
		s1.setCourse(c1);
		t1.setCourse(c1);
		s1.setTea(t1);
```
7. 调用方法
```
//		判断学生是否选课
		if(s1.getC().getCnumber()==0){
			System.out.println(s1.show()+"\n该学生已经退课");
		}else
			System.out.println(s1.toString());
```
# 五、实验结果
1. 学生选课成功，并且课程中老师信息与所给老师信息相等时（一门课程只由一门老师教授），输出结果
![图片](https://p.qlogo.cn/qqmail_head/ajNVdqHZLLCjXzl2bwPUPHEQOOzARqLRmZFqzPgyAkzdweOBibC68M8Sof8atNPjFjb2wpZzEibR0/0)
# 六、实验感想

