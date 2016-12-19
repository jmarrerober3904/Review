// APCS1 Lab Test 2
//
// Prog03.java
//
// Fix Multi-Way Selection
//
// Points: 1

////////////////////////////////////////////////////////////////////////////////
// This program is supposed to display the Day of the Week (Sunday, Monday, . . . Friday, Saturday) after the user 
// enters the corresponding Month Number (1, 2, ... 7).  
//
// Right now the program will compile and execute, but the output is not proper:
//
// Enter month number  { 1 - 7}  -->  3
// Tuesday
// Wednesday
// Thursday
// Friday
// Saturday
// Invalid Month Number
//
// Here are a couple examples of what the output should look like:
//
// Enter month number  { 1 - 7}  -->  3
// Tuesday
//
// Enter month number  { 1 - 7}  -->  13
// Invalid Month Number



import java.util.Scanner;													

public class Prog03
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number for the day of the week { 1 - 7}  -->  ");
		int DoW= input.nextInt();
		switch (DoW)
		{
			case  1 : System.out.println("Sunday");break;
			case  2 : System.out.println("Monday");break; 
			case  3 : System.out.println("Tuesday");break;
			case  4 : System.out.println("Wednesday");break;
			case  5 : System.out.println("Thursday");break;
			case  6 : System.out.println("Friday");break; 
			case  7 : System.out.println("Saturday");break; 
			default : System.out.println("Invalid Day Number"); 
		}
	}
}

