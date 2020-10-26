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
* 创建父类Person人员封装类
    > 类中定义number,  name, sex, age四个变量,分别表示人员编号、姓名、性别、年龄。使用set方法设置参数。设置get方法获取参数，
    > 用super创建有参构造方法和无参构造方法，使用使用Object根类的toString（）方法打印人员基本信息，并在打印输出方法中使用if（）else判断人员性别
2. 创建Course封装类
    > 在类中定义 cnumber,  cname, adress, teacher,time五变量,分别表示课程编号、课程名、上课地点、授课教师、上课时间。使用set方法设置参数。设置get方法获取参数，
    > 使用super创建有参构造方法和无参构造方法，使用使用Object根类的toString（）方法打印课程基本信息
3. 建子类Teacher教师类继承父类Person类
    > 在类中定义Course类型的属性变量，使用set方法设置参数。设置get方法获取参数
    > 使用super调用父类中的构造方法，使用使用Object根类的toString（）方法打印课程基本信息
# 四、核心代码
# 五、实验结果
# 六、实验感想

