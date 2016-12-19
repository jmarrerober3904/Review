// APCS1 Lab Test 2
//
// Prog05.java
//
// Rounding PI & E
//
// Points: 2
//
////////////////////////////////////////////////////////////////////////////////
// Right now this program displays this output:
//
// PI = 3.141592653589793 
// E  = 2.718281828459045
//
////////////////////////////////////////////////////////////////////////////////
// Alter this program so that the values of Math.PI and Math.E are displayed
// rouded to 2 decimal places.
//
////////////////////////////////////////////////////////////////////////////////
// When complete, the output should look like this:
//
// PI = 3.14
// E  = 2.72



import java.text.DecimalFormat;

public class Prog05
{
	public static void main (String args[])
	{
		System.out.println("PI = " + Math.round(Math.PI * 100)/100.0);
		System.out.println("E  = " + Math.round(Math.E*100)/100.0);
	}
}



