/*Name: Chen Wenjing (Chen Chen showed on the Latte)
Email: wchen47@brandeis.edu
Date: Oct 4 2016
Purpose of the program: use for loop and static method to solve the problem
Bugs: None
*/

import java.util.*;

public class Problem7{
	public static void main(String[] agrs){

		//create a scanner object
		Scanner console = new Scanner(System.in);

		//aske the user to enter the number
		System.out.println("please enter the number of rows.");

		//initialize the variable
		int num1 = console.nextInt();

		//ask the user to enter the number
		System.out.println("please enter the number of columns.");

		//initialize the variable
		int num2 = console.nextInt();

		compute(num1, num2);

	}

	// create a static method
	public static void compute(int num1, int num2){


		//use the for loop to compute
		for(int i = 1; i <= num1; i++){
			for(int j = 0; j< num2; j++){

				int printnum = i + num1 * j;
				System.out.printf("%-5s",printnum);
			}	
			System.out.println();
		}




	}
}