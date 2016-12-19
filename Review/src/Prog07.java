// APCS1 Lab Test 2
//
// Prog07.java
//
// Student Class
//
// Points: 3
//
////////////////////////////////////////////////////////////////////////////////
// Complete the Student class in the file Student.java which will allow this
// program to execute.
//
// DO NOT ALTER THIS FILE IN ANY WAY !!!!!!!


public class Prog07
{
	public static void main (String args[])
	{
		Student stu1 = new Student();
		Student stu2 = new Student("Mariana Belle Garcia", 28, 4.0);
        
		System.out.println("Information for stu1");
		System.out.println("====================");
		System.out.println("Name: "+stu1.getName());
		System.out.println("Age:  "+stu1.getAge());
		System.out.println("GPA:  "+stu1.getGPA());
 		System.out.println();      
		System.out.println("Information for stu2");
		System.out.println("====================");
		System.out.println("Name: "+stu2.getName());
		System.out.println("Age:  "+stu2.getAge());
		System.out.println("GPA:  "+stu2.getGPA());		
		System.out.println();
	}
}

