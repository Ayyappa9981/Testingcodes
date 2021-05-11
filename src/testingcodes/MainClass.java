package testingcodes;

//Creating a Class and an Object

//Initalisation to the variables
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

//Initalisation with the method

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

//Inheritance:-Single, Mutlilevel, Hierarichal

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
//Hierarechal inheritance

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
*/

//Polymorphism:-Method overloading,Method Overriding

//Method overloading -----Compile time 
/*
class Sum
{
	int add(int x,int y)
	{
		return x+y;
	}
	int add(int x,int y,int z)
	{
		return x+y+z;
	}
	float add(float x, float y)
	{
		return x+y;
	}
}
class MainClass
{
	public static void main(String[] args) {
//		Sum s =new Sum();
//		int res1,res2;
//		float res3;
//		res1=s.add(10,40);
//		res2=s.add(10,20,30);
//		res3=s.add(10.5f,10.5f);
//		System.out.println(res1);
//		System.out.println(res2);
//		System.out.println(res3);
		System.out.println(Sum.add(10,20));
		System.out.println(Sum.add(10,20,30));
		System.out.println(Sum.add(10.7f,20.5f));
	}
}
*/

//method over riding --Run time
/*
class Student1
{
	void msg()
	{
		System.out.println("messaging......");
	}
}
class Student2 extends Student1
{
	void msg()
	{
		System.out.println("chatting............");
	}
}
class MainClass
{
	public static void main(String[] args) {
		Student2 myObj =new Student2();
		myObj.msg();
	}
}
*/

//Abstraction:-Abstract class, Interface

//Abstract class
/*
abstract class Bike {
	abstract void run();
}

class Honda extends Bike {
	public void run() {
		System.out.println("Running Superb!!!!!!");
	}
}

public class MainClass {
	public static void main(String[] args) {
		Bike h = new Honda();
		h.run();
	}
}
*/
/*
abstract class Drawing {
	abstract void draw();
}

class Rectangle extends Drawing {
	public void draw() {
		System.out.println("Drawing a rectangle!!!");
	}
}

class Triangle extends Drawing {
	public void draw() {
		System.out.println("Drawing a Triangle");
	}
}

public class MainClass {
	public static void main(String[] args) {
		Drawing d = new Triangle();
		d.draw();
	}
}
*/



//Interface
/*
interface Car {
	void run();
}

class Santro implements Car {
	public void run() {
		System.out.println("Car is running safely");
	}
}

class MainClass {
	public static void main(String[] args) {
		Car s = new Santro();
		s.run();

	}
}
*/

/*
interface Drawable
{
	void draw();
}
class Rectangle implements Drawable
{
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
}
class Triangle implements Drawable
{
	public void draw() {
		System.out.println("Drawing a Triangle");
	}
}
class MainClass{
	public static void main(String[] args) {
		Drawable d=new Triangle();
		d.draw();
	}
}
*/

//Encapsulation

class Student{
	private int rollno;
	private String name;
	private String gender;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
}
class MainClass{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setRollno(12345);
		s1.setName("Ayyappa");
		s1.setGender("Male");
		System.out.println("Rollno:"+s1.getRollno());
		System.out.println("Name:"+s1.getName());
		System.out.println("Gender:"+s1.getGender());
	}
}
