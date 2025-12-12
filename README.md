"# cscglobal202501" 

Required Software & Download Links


1. Java Development Kit (JDK 21)

Install the latest Oracle JDK 21 (Windows x64):

Download: https://download.oracle.com/java/21/latest/jdk-21_windows-x64_bin.msi

2. Eclipse IDE

Use the Enterprise Edition for Java and Web Development (includes incubating components).

Version: 2025-12 M3 (4.38.0 M3)

Build ID: 20251120-0739

Download: https://www.eclipse.org/downloads/

3. PostgreSQL Database

Install the latest PostgreSQL 18 release from EnterpriseDB.

PostgreSQL 18 Download Page:
https://www.enterprisedb.com/downloads/postgres-postgresql-downloads

Direct Windows Installer Link:
https://sbp.enterprisedb.com/getfile.jsp?fileid=1259824&_gl=1*1yycuma*_gcl_au*MTM0NDg3NzYxMC4xNzY0NzQ0NDc3*_ga*R0ExLjEuR0ExLjIuR0ExLjEuNzI3MTE5NTk3LjE3NjQ3NDQ0Nzc.*_ga_ND3EP1ME7G*czE3NjUyNjg1NjIkbzIkZzEkdDE3NjUyNjg1NjIkajYwJGwwJGgxNDYzMzcwMDgz

---------------


# Java

Java is an Object Oriented Programming language. It was picked up by Oracle, that develops 1 common implementation of the JRE and JDK, and through their (and others) efforts, Java has become very widely used.

## Features/Characteristics

- Object Oriented
- Strongly and Statically Typed
- Leverages Java ByteCode (.class files) to accomplish distribution of Java programs
    - Makes it easier to share/collaborate
- Garbage Collector handles Memory Management for the developer

malloc	free
new 	delete
new	XX


- The JVM is small, and so can be run on many different platforms
    - Particularly useful for embedded systems 


- Many standard libraries are provided
- Relatively performant
    - Not as fast as C or C++, but faster than most other languages
- As of Java 8, introduced some APIs for Functional Programming

## JVM / JRE / JDK

JDK stands for Java Devlopment Kit

JRE stands for Java Runtime Environment

JVM stands for Java Virtual Machine

JDK contains the JRE, as well as many different developer tools, such as the compiler or the archiver.

JRE contains the JVM as well as supporting libraries that the JVM needs to function.

The Java Compiler is the executable that produces Java ByteCode from Java Source Code (From .java to .class)

The JVM (along with the libraries from the JRE) executes the Java ByteCode.


## Garbage Collection

The Java Garbage Collector is a separate thread that runs alongside your Java program. This is a Deamon Thread, which means it is a long running thread, that will often be "asleep". It will occasionally "wake up" and perform some garbage collection. This means it will find any objects in memory that are no longer being used, and freeing that memory so that other processes can use it again.


Java has 8 primitive datatypes that are NOT objects. These primitive datatypes are generally stored on the stack (if they are local variables).


numbers 
		byte		1 byte		-127		+ 128
		short		2 byte		
		***	int		4 byte
		long		8 byte

decimal
		float		4 byte
		****	double		8 byte

true/false
		boolean		1 byte

char		char		2 byte



byte rollNumber = 150;	//error




- int
    - 4 bytes = 32 bits
- double
    - 8 bytes = 64 bits
- byte
    - 1 byte = 8 bits
- boolean
    - 1 byte = 8 bits (sort of)
    - JVM dependent
    - They can potentially be stored in only 1 bit, if many booleans are created
    - Among other optimizations
- char
    - 2 bytes = 16 bits
- long
    - 8 bytes = 64 bits
- float
    - 4 bytes = 32 bits
- short
    - 2 bytes = 16 bits



Casting in java - Converting one data type to another data type value.

Implict and Explicit


Implicit : Automatically by java compiler

Explicit : By developer.



There is an additional concept of "Reference Variables". These are variables that store the memory address of an object located somewhere in the heap. These Reference variables can be stored on the Stack.

The Stack has "Stack Frames". Each frame is associated with a single function/method call. Any local variables (or parameters) created will be associated with only this stack frame.
When you call/invoke another function, a new stack frame is produced.

## Java Source Code

Syntax for a programming language is quite important. The specific grammer is interpreted another program (the Java Compiler) to produce Java ByteCode. The result of this, is that it is very particular about that grammar. We have certain specialized (reserved) keywords that indicate certain information to the Compiler. Of particular note, is the `class` keyword. Other examples are `public`, `static`, `void`, etc.
A little bit different from grammer/syntax is Naming Conventions. These are specific styles that we (as developers) like to enforce in order to make it easier for other human beings to understand the code. The first example, is having class names that begin with a capital letter. From there, every new word that is part of the name will have another capital letter. Variable names have a similar convention, except that will begin with a lowercase letter. For example, `myString`.

What is Java ?

JDK
**  JVM is platform dependent
JRE


Hands on : 
Create a class named Airline
Inside the class, Create a method named bookTicket and print the PNR number (different).

Expected output : 

Your Ticket booked and PNR number is : UNY7123
Your Ticket booked and PNR number is : JAY9272


class Airline
{
	public void bookTicket(String pnr)
	{
		System.out.println("Your ticket booked and your PNR number is :"+ pnr);
	}
	public static void main(String[] args)
	{
		Airline air = new Airline();
		air.bookTicket("UNY7123");
		air.bookTicket("SRF7123");
		air.bookTicket("SSD7123");
		air.bookTicket("KKII7123");
	}
}


Hands on : 

Create a class named Product
Inside the class , create a method named searchProduct(String productName) and print different result like 


Expected output : 
You have search for product : Lakme
You have search for product : Mouse
You have search for product : Printer
You have search for product : Mobile




----------------------------------------------
-----OOP

# Object Oriented Programming

Object Oriented Programming focuses on the concepts of Classes and Objects. Where objects are representations of real world objects, in code. Classes are blueprints for these objects.

We define Objects as having state and behavior: properties/characteristics/fields as well as methods/functions.

Object Oriented Design has 4 pillars: Abstraction, Polymorphism, Inheritance, and Encapsulation (A-PIE)

## Abstraction

You do not show the underlying details, you only show what is needed.
This is accomplished occasionally with private methods, that contain complex logic that isn't important. As well as through the use of interfaces and abstract classes. In general, we combine this pillar with the pillar of Polymorphism to hide away the underlying details, and only show the contract to interact in a particular way (such as with the List interface).

## Polymorphism

Polymorphism as an English word means to take on many forms. More specifically, it means an Object can take on different forms/characteristics. An Object can take on the form of any Class within its inheritance heirarchy. An Example would be that a Rabbit can take on the form of the Animal Class.

There are additionally 2 techniques we can use to accomplish Polymorphism: Method Overloading and Method Overriding.

Method Overriding is when a subclass replaces the implementation of a parent class's method, generally with a more specific implementation. The subclass must have the exact same method name and parameters (together are called the "method signature"). The return type can be changed on a limited scope. If the parent class's method had an Object as the return type, the subclass may change the return type to be a subclass of the original return type. For example, if the parent class returned an `Object`, the suclass could change the return type to `Animal`. However, if the parent class's return type was `void` or a primitive, the subclass cannot change it.

Method Overloading is when you define multiple methods with the same name, but with a different method signature (in particular, this means there will be a different list of parameter types). You cannot overload a method by simply having a different return type. However, overloaded methods may have different return types. Under the hood in Java, overloaded methods are simply independent and unrelated methods. They may have different types because of this.

When we declare multiple Constructors, this _is_ Method Overloading, or Constructor Overloading.

Method Overriding is referred to as "Runtime Polymorphism". Method Oveerloading is referred to as "Compile-time Polymorphism".

Another technique that ties into Polymorphism is called "Covariance" or "Covariant Return Types".
This where the reference variable is of a different type from the Object it points to. This ties into the pillar of Abstraction as well, since we can effectively hide the details of the specific subclass if it is not important.

## Inheritance

The pillar of Inheritance stipulates that Classes are able to inherit properties and behaviors from a Parent class. In particular, subclasses are "more specific" versions of a parent class. Examples might be inheriting from a `Animal` class to define a `Dog` class. Or inheriting from a `Person` class to define a `Employee` class.

In Object Oriented Design, there are different types of Inheritance, such as "Multiple Inheritance" or "Multi-Level Inheritance". Multiple Inheritance is that a single class can inherit from multiple parent classes. Multi-Level Inheritance is that inheritance can chain across multiple generations. For Example, `Animal` - `Person` - `Student` - `MathStudent`

Java supports Multi-Level Inheritance, but does not support multiple Inheritance for classes. However, interfaces do support multiple inheritance. This is allowed through the various restrictions placed on interfaces. For example, interfaces can only have `public` and `abstract` methods (or must use the `default` or `static` keywords).

## Encapsulation

The idea of Encapsulation is that Objects should restrict access to the data (state/properties) to be used in proper ways. For example, if an object has an `age` property, it should restrict access so that this property cannot be set to a negative value.

We accomplish Encapsulation through the use of the 4 access modifiers (`public`, `protected`, `private`, and `default`) along with public getter/setter methods to control the manipulation/access to the data.



---------------------------------


Hands on :

Create a class Calculator with a method 

addition(int num1,int num2)


Expected Output : 

The sum is : 90
The sum is : 42



class Calculator
{
			
	public static void main(String args[])
	{
		Calculator c = new Calculator();
		c.addition(45,45);
		c.addition(4,42);
		c.addition(4,42);
		c.addition(412,45);
	}
}




----------

class Airline
{
    int salary=97000;
    byte rollNumber = 125;
    boolean married = true;
    float gst = 45.6f;  
    byte b1 = 16;
    byte b2 = 32;
    double budget = 9800.98;
    int marks = 100;
    char alphabet = 'A';
    
    public void display(){
        byte result = (byte)(b1 + b2);      //explicit
        float cscBudget = (float) budget;   //explicit
        marks = alphabet;       //implicit
        System.out.println(marks);
        System.out.println(result);
        System.out.println("2. DISPLAY CALLED :"+(salary+rollNumber));
    }
	public void bookTicket(String pnr)
	{
	    Airline air = new Airline();
	    air.display();
	    System.out.println("Martial status is :"+married);
		System.out.println("3. Your ticket booked and your PNR number is :"+ pnr);
		System.out.println("Gst is :"+gst);
	}
	public static void main(String[] args)
	{
	    System.out.println("1.  MAIN CALLED");
		Airline air = new Airline();
		air.bookTicket("JAJSHS877");
	}
}
-----------


---Real time scenario


class Calculator
{
    public void addition(int a, int b) 
    {
        System.out.println("The sum is: " + (a + b));
    }
    public static void main(String args[])
    {
        Calculator c=new Calculator();
        c.addition(2,4);
        c.addition(34,42);
        c.addition(24,21);
        c.addition(46,4);


    }
    
    
}


The sum of 2 and 4 is : 6
The sum of 34 and 42 is : 76

class Calculator
{
    public void addition(int a, int b) 
    {
       // System.out.println("The sum is : " + (a + b));
       //The sum of 2 and 4 is : 6
       System.out.println("The sum of "+ a +" and "+b+ " is : "+ (a+b));
    }
    public static void main(String args[])
    {
        Calculator c=new Calculator();
        c.addition(2,4);
        c.addition(34,42);
        c.addition(24,21);
        c.addition(46,4);
    }
}









Real time scenarios : Users and Permissions
New User
Delete Users


Introduction to OOP
What is Object-Oriented Programming?
Classes and objects







Employee
		int employeeId;
		String employeeName;
		int salary;
		
		
		markAttendance()
		swipeAccessCard()
		updatePersonalDetails()
		




Conditional statements: if, else, switch
Loops: for, while, do-while
Break, continue, return


if-else

class Calculator
{
    public void addition(int a, int b) 
    {
        if(a < 0 ) {
        System.out.print("First number is negative ");
        System.out.println("The negative number is :"+ a);
        }
         else if(b < 0 ){
               System.out.print("Second number is negative ");
        System.out.println("The negative number is :"+ b);
         }
         else if (a > 2000)
         {
             System.out.println("First number is greater than 2000");
         }
               else if (b > 2000)
         {
             System.out.println("Second number is greater than 2000");
         }
         else {
       System.out.println("The sum of "+ a +" and "+b+ " is : "+ (a+b));
         }
    }
    public static void main(String args[])
    {
        Calculator c=new Calculator();
        c.addition(-2,4);
       c.addition(2433,34);
        c.addition(46,-4);
        c.addition(46,40);
    }
}


switch


class AccessCard
{
    public void activate(int attempt){
	switch(attempt)
	{
		case 1: System.out.println("Attempt one failed");
                                         break;
		case 2: System.out.println("Two attempts failed");
                                         break;
		case 3: System.out.println("Third attempt also not correct");
                                         break;
		case 4: System.out.println("4th Attempt also done");
                                         break;
		default : System.out.println("Invalid Attempt");
	}
    }
   public static void main(String args[])
    {
	AccessCard a1 = new AccessCard();
	a1.activate(78);
    }
}


for, while, do-while



class Simulate
{ 

 public void display()
 {
       for(int i=1;i<=5000;i++)
           System.out.println("The value of i is :"+i);
 }

   public static void main(String args[])
    {
	Simulate a1 = new Simulate();
	a1.display();
    }
}




10
9
8
..
1


















Break, continue, return
----------------------------------

Why we need methods ?
Why we need return types ?

package com.employee_management_system;

public class Greetings {

	public void sayHello() {
		System.out.println("Hello Guest");
	}
	public boolean ageValidator(int age) {
		if(age < 18)
			return false;
		else
			return true;
	}
	public int calculateGiftCardValue(int age) {
	    int eligibleYears = age - 18;   // Only years above 18 are counted
	    int giftPerYear = 50;
	    return eligibleYears * giftPerYear;
	}
	public void greetUser(String username,String gender,int age) {
		
		boolean result = ageValidator(age);
		if(result == true) {
			
			int value = calculateGiftCardValue(age);
			if (gender.equals("male"))
				System.out.println("Hello Mr. " + username+" Gift value :"+value);
			else
				System.out.println("Hello Ms/Mrs. " + username+" Gift value :"+value);
		}
	}
	
	public static void main(String[] args) {
			Greetings greetings = new Greetings();
			greetings.sayHello();
			greetings.greetUser("Vinay","male",40);
			greetings.greetUser("Neha","female",89);

		
	}
}



Operators in java

Arthimetic +,-* 
Logical 		&& || !
Increment and decrement ++, --


num1++;


+= , 

num -= 2;

num = num -2;


if( salary> 98000)  && (gst < 3)
{
	
}


if( salary> 98000)  || (gst < 3)
{
	
}


if(!married)
{

}



Access specifiers
----------------------


public



private



protected




default






----------------------------- M E N U Driven program to register new employees


1. Add new employee
2. Delete new employee
3. Update employee details
4. Display All Employees details
0. E X I T




Employee
	employeeId
	employeeName
	salary
	deptartmentId
	mobileNumber;

What is constructor in java ?

A constructor in Java is a special block of code used to initialize an object when it is created.

Key Points About Constructors

A constructor has the same name as the class.

It does not have a return type (not even void).

It is called automatically when you create an object snew.


Overloading  - Polymorhism
---------------------------------------

Constructor overloading

Method Overloading
---------------------------


Inheritance
-----------------

extends
child classes can access parent class not private respources without creating an object.


Employee


Overriding
---------------------

Abstract class and Interface in java



----------------Arrays 
































Exception in java
-------------------------

Runtime errors

	ArrayIndexOutOfBoundsException
	NegativeArraySizeException
	

Types of exceptions: Checked & unchecked




    private static final String BASE_URL = "http://localhost:8080/identityiq/rest";


throw
throws



Custom exception
















static 
----------------------------

























































Collections
-----------------

Use case : From the sailpoint, large amount of users data will be fetched.


String name[] = new String[100];

sort


Collections.sort(name);

Set of classes and interfaces to suit our requirements.

1) Choices
2) Less learning curve
3) Not to reruired to reinvent the wheel
4) Less code


	Collection 


Set<no duplicates>		List<duplicates>			Map<key value>, no duplicate keys


Classes
HashSet (any order)			ArrayList		TreeMap<sorted>
TreeSet	(sorted)				LinkedList		HashMap<any order)
LinkedHashSet (as you enter)			Vector		LinkedHashMap ( as you enter>


Use case : I have to store all your names and display in ascending order


Wrapper classes

int	Integer
double	Double
float	Float


File I/O
-----------

Reading and Write from files through java


 <dependency>
    <groupId>javax.xml.bind</groupId>
    <artifactId>jaxb-api</artifactId>
    <version>2.3.1</version> <!-- Or a suitable version -->
</dependency>
<dependency>
    <groupId>org.glassfish.jaxb</groupId>
    <artifactId>jaxb-runtime</artifactId>
    <version>2.3.8</version> <!-- Or a suitable version -->
    <scope>runtime</scope>
</dependency>



import javax.xml.bind.annotation.*;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {



import javax.xml.bind.*;



      JAXBContext context = JAXBContext.newInstance(Employee.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(emp, new File("employee.xml"));
        System.out.println("Done Writing");
























import javax.xml.bind.*;
import java.io.File;

public class JAXBRead {
    public static void main(String[] args) throws Exception {

        JAXBContext context = JAXBContext.newInstance(Employee.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        Employee emp = (Employee) unmarshaller.unmarshal(new File("employee.xml"));

        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
    }
}


Reading JSON file from java
-------------------------------------

	<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>2.17.0</version>
		</dependency>




 ObjectMapper mapper = new ObjectMapper();

        // Read the JSON file and convert to Java Object
        Identity identity = mapper.readValue(new File("identity.json"), Identity.class);




JUnit
----------


Testing































