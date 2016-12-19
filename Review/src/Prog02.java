// APCS1 Lab Test 2
//
// Prog02.java
//
// Bonus
//
// Points: 1
//
////////////////////////////////////////////////////////////////////////////////
// Complete this program so that it will determine the "End-Of-Year-Bonus" for an exployee.
// All employees get a default bonus of $250.
// Employees who sell $500,000 in murchandise (or more) get an additional $750 bonus
//
// Output Examples:
//
// Enter Sales for the past year  -->  150000
// Sales: 150000.0
// Bonus: 250.0
//
// Enter Sales for the past year  -->  1000000
// Sales: 1000000.0
// Bonus: 1000.0


import java.util.Scanner;													

public class Prog02
{
	public static void main (String args[]) 						
	{   
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Sales for the past year  -->");
		Double sales  = input.nextDouble();
        double bonus = 250;
        if(sales >= 150000.0)
        {
        	bonus += 250;
        	System.out.println("Sales : 150000.0");
        	System.out.println("Bonus : 250.0");
        }
		System.out.println("Enter Sales for the past year  -->");
		Double sales1  = input.nextDouble();
        double bonus1 = 750;
        if(sales1 >= 100000.0)
        {
        	bonus1 += 750;
        	System.out.println("Sales : 100000.0");
        	System.out.println("Bonus : 1000.0");
        }
		
		
		
	}
}

