/*Name: Chen Wenjing (Chen Chen showed on the Latte)
Email: wchen47@brandeis.edu
Date: Oct 4 2016
Purpose of the program: use for loop and parameter to solve the problem
Bugs: None
*/

import java.util.*;
public class Problem1{
	public static void main(String[] args){

		// create a scanner object
		Scanner console = new Scanner(System.in);



		//ask the user to enter the number and initialize the variable
		System.out.println("Please enter the number of times the player was at bat in integer");	
		int times = console.nextInt();

		System.out.println("Please enter the number of hits earned in double");
		double earnhits = console.nextDouble();

		//call the method
		compute(times, earnhits);


	}

	//create a method to compute
	public static void compute(int times, double earnhits){

		//create the variable
		double average = earnhits / times;

		System.out.printf("The batting average is %.4f\n", average);

	}
}