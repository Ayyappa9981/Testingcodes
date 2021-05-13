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
/*
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
*/

//This Keyword

//This is used to refer current class instance variable.
/*
class Student {
	int rollno;
	String name;
	String gender;

	public Student(int rollno, String name, String gender) {
		this.rollno = rollno;
		this.name = name;
		this.gender = gender;
	}
}
class MainClass{
	public static void main(String[] args) {
		Student s1=new Student(123,"Ayyappa","Male");
		System.out.printf("Rollno:%s\nName:%s\nGender:%s",s1.rollno,s1.name,s1.gender);
	}
}
*/

//This is used to refer current class method
/*
class Message {
	void msg1() {
		System.out.println("Messaging");
	}
	void msg2() {
		this.msg1();
		System.out.println("Chatting");
	}
}
class MainClass {
	public static void main(String[] args) {
		Message m = new Message();
		m.msg2();
	}
}
*/

// This is used to refer current class constructor
/*
class Student {
	int rollno;
	String name;
	String gender;
	float cgpa;

	Student(int rollno, String name, String gender) {
		this.rollno = rollno;
		this.name = name;
		this.gender = gender;
	}

	Student(int rollno, String name, String gender, float cgpa) {
		this(rollno, name, gender);
		this.cgpa = cgpa;
	}
	void display() {
		System.out.printf("Rollno:%s\nName:%s\nGender:%s\nCGPA:%s\n",rollno,name,gender,cgpa);
	}
}
class MainClass {
	public static void main(String[] args) {
		Student s =new Student(123,"Ayyappa","Male",9.5f);
		Student s1 =new Student(123,"Kumar","Male",8.5f);
		s.display();
		s1.display();
	}
}
*/

//Super Keyword

//Super is used to refer immediate parent class variable

/*
class Student1 {
	int marks1=100;
}
class Student2 extends Student1 {
	int marks2=101;
	void display() {
		System.out.println("Child class:"+marks2);
		System.out.println("parent class:"+super.marks1);
	}
}
class MainClass {
	public static void main(String[] args) {
		Student2 s = new Student2();
		s.display();
		
	}
}
*/

//Super is used to refer immediate parent class method

/*
class Student1 {
	void msg1() {
		System.out.println("Messaging 1......");
	}
}
class Student2 extends Student1 {
	void msg2() {
		super.msg1();
		System.out.println("Messaging 2..........");
	}
}
class MainClass {
	public static void main(String[] args) {
		Student2 s = new Student2();
		s.msg2();
	}
	
}
*/

//Super is used to refer parent class Constructor
/*
class Student1 {
	int id;
	String name;
	String gender;
	Student1(int id,String name,String gender) {
		this.id=id;
		this.name=name;
		this.gender=gender;
	}
}
class Student2 extends Student1 {
	long mblno;
	String fname;
	String mname;
	Student2(int id,String name,String gender,long mblno,String fname,String mname) {
		super(id,name,gender);
		this.mblno=mblno;
		this.fname=fname;
		this.mname=mname;
	}
}
class MainClass {
	public static void main(String[] args) {
		Student2 s = new Student2(123,"Ayyappa","Male",9502140845L,"VenkataRao","Ravanamma");
		System.out.printf(" ID:%s\n Name:%s\n Gender:%s\n Mobileno:%s\n Father name:%s\n Mother name:%s\n",s.id,s.name,s.gender,s.mblno,s.fname,s.mname);
	}
}
*/

//Static variable
/*
class Student {
	int rollno;
	String name;
	String gender;
	static float cgpa=9.5f;
	void display() {
		System.out.println("Rollno:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Gender:"+gender);
		System.out.println("CGPA:"+cgpa);
	}
}
class MainClass {
	public static void main(String[] args) {
		Student s = new Student();
		s.rollno=123;
		s.name="Ayyappa";
		s.gender="Male";
		s.display();
		Student s1 = new Student();
		s1.rollno=456;
		s1.name="Kumar";
		s1.gender="Male";
		s1.display();
	}
}
*/

//Static method


/*
class Student {
	int rollno;
	String name;
	String gender;
	static float cgpa=9.5f;
	static void change() {
		cgpa=8.5f;
	}
	void display() {
		System.out.println(name+" "+rollno+" "+gender+" "+cgpa);
	}
}
class MainClass {
	public static void main(String[] args) {
		Student.change();
		Student s = new Student();
		s.rollno=123;
		s.name="Ayyappa";
		s.gender="Male";
		
		s.display();
		Student s1 = new Student();
		s1.rollno=456;
		s1.name="Kumar";
		s1.gender="Male";
		s1.display();
	}
}
*/
//final variable

/*
class MainClass {
	public static void main(String[] args) {
	final int a =10;
	int num=5,i;
	for(i=1;i<=num;i++) {
		System.out.println("i value is:"+i);
		System.out.println("j value is:"+(a+i));
	}
}
}
*/

//final method

class Student {
	int num=10;
	final void display() {
		System.out.println(num);
	}
}
class Student1 extends Student {
	int num2=20;
	void display() {
		System.out.println(num2);
	}
}
class MainClass {
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.display();
		
	}
}









































