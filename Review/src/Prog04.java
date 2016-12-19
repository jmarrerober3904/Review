// APCS1 Lab Test 2
//
// Prog04.java
//
// Pass/Fail
//
// Points: 2
//
////////////////////////////////////////////////////////////////////////////////
// Complete this program so that it will display if a student is on the A/B Honor Roll
// Grades 80 and above are on the list.  Grades below 80 are not.
// This program REQUIRES the use of 2-way selection
//
// Output Examples:
//
// Enter Grade  -->  80
// You Made the Honor Roll
//
// Enter Grade  -->  69
// :-( You didn't make the Honor Roll


import java.util.Scanner;													

public class Prog04
{
	public static void main (String args[]) 						
	{   
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Grade  -->  ");
		double grade = input.nextInt();
		
		if (grade >= 80)
			System.out.println("You Made the Honor Roll");
		else
			System.out.println("You didn't make the Honor Roll");

	}
}

