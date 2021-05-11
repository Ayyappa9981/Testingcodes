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