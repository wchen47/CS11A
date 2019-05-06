/*Name: Chen Wenjing (Chen Chen showed on the Latte)
Email: wchen47@brandeis.edu
Date: Oct 23 2016
Purpose of the program: to compute the number again and again and result in 1 by using the for loop and the if statement
Bugs: None
*/

import java.util.*;

public class Problem3{
	public static void main(String[] args){
		// create a scanner object
		Scanner console = new Scanner(System.in);
		//aske the user to enter the number
		System.out.print("Initial value is: ");
		// create and initialize the integer
		int num = console.nextInt();
		// call the method
		compute(num);


	}

	public static void compute(int num1){
		// if statement
		if(num1 < 1){
			System.out.println("Error");
		//nest if
		}else if (num1 == 1){
			//print out
			System.out.println("Final value, 1");
		//nest if
		}else if (num1 != 1){
			//call the method
			repeat(num1);
		}	
	}
	//create another method
	public static void repeat(int num1){
		// use the for loop
		for (int i = num1; i != 1;){
			// if statement
			if(num1 % 2 == 1){
				//compute
				num1 = num1 * 3 + 1;
				System.out.println("Next value is: " + num1);
			// nest if statement	
			} else if(num1 % 2 == 0){
				num1 = num1 / 2;
				System.out.println("Next value is; " + num1);
			}
			// return a value
			i = num1;
		}

	}
}