/*Name: Chen Wenjing (Chen Chen showed on the Latte)
Email: wchen47@brandeis.edu
Date: Oct 4 2016
Purpose of the program: use for loop and parameter and static method to compute the to solve the problem of factorial
Bugs: None
*/


import java.util.*;

public class Problem5{
	public static void main(String[] args){

		//create a scanner object
		Scanner console = new Scanner(System.in);

		//ask the user to enter the number and initialize the variables
		System.out.print("Enter the first number:");
		int integer1 = console.nextInt();
		System.out.print("Enter the second number:");
		int integer2 = console.nextInt();
		System.out.print("Enter the third number:");
		int integer3 = console.nextInt();

		//print out
		System.out.println(integer1 + "! =" + compute(integer1));
		System.out.println(integer2 + "! =" + compute(integer2));
		System.out.println(integer3 + "! =" + compute(integer3));

	}


	// create a static method
	public static int compute(int integer){

		//the first number
		int result = 1;

		for(int i = 1; i <= integer; i++){
			result = result * i;
		}
		// return the result
		return result;
	}


}