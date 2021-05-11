package testingcodes;

//Creating a Class and an Object

//Intialisation to the variables
/*
class Student {
	int rollno = 123;
	String name = "Ayyappa";
	String dept = "E.C.E";
}
public class MainClass {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.printf("Student name is:%s\n",s1.name);
		System.out.printf("Student rollno is:%s\n",s1.rollno);
		System.out.printf("Student Dept.is:%s\n",s1.dept);
	}
}
*/

//Initalisation in the main method

/*
class Student 
{
	int rollno;
	String name;
	String dept;
	void insert(int r,String n,String d)
	{
		rollno=r;
		name=n;
		dept=d;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+dept);
	}
}

public class MainClass{
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.insert(123,"Ayyappa","E.C.E");
		s2.insert(456,"Kumar","C.S.E");
		s1.display();
		s2.display();
	}
	
}
*/

//Initalisation through Constructor

/*
class Student
{
	int rollno;
	String name;
	String dept;
	
	Student(int r,String n,String d)
	{
		rollno=r;
		name=n;
		dept=d;
	}
	
	void display()
	{
		System.out.println(name+" "+rollno+" "+dept);
	}
}
public class MainClass{
	public static void main(String[] args) {
		Student s1=new Student(123,"Ayyappa","E.C.E");
		Student s2=new Student(456,"Kumar","C.S.E");
		s1.display();
		s2.display();
	}
	
}
*/

//Inheritance

//Single inheritance
/*
class Student1
{
	void msg1()
	{
		System.out.println("Student 1 is Shouting!!!");
	}
}
class Student2 extends Student1
{
	void msg2()
	{
		System.out.println("Student 2 is Shouting!!!");
	}
}

public class MainClass
{
	public static void main(String[] args) {
		Student2 myObj =new Student2();
		myObj.msg2();
		myObj.msg1();
	}
}
*/

//multilevel inheritance

/*
class Student1
{
	void msg1()
	{
		System.out.println("Student 1 is Shouting!!!");
	}
}
class Student2 extends Student1
{
	void msg2()
	{
		System.out.println("Student 2 is Shouting!!!");
	}
}

class Student3 extends Student2
{
	void msg3()
	{
		System.out.println("Student 3 is Shouting!!!");
	}
}
public class MainClass
{
	public static void main(String[] args) {
		Student3 myObj =new Student3();
		myObj.msg1();
		myObj.msg2();
		myObj.msg3();
	}
}
*/
//Heirarechal inheritance


class Student1
{
	void msg1()
	{
		System.out.println("Student 1 is Shouting!!!");
	}
}
class Student2 extends Student1
{
	void msg2()
	{
		System.out.println("Student 2 is Shouting!!!");
	}
}

class Student3 extends Student1
{
	void msg3()
	{
		System.out.println("Student 3 is Shouting!!!");
	}
}
public class MainClass
{
	public static void main(String[] args) {
		Student3 myObj =new Student3();
		myObj.msg1();
		myObj.msg3();
	}
}
















