/*Name: Chen Wenjing (Chen Chen showed on the Latte)
Email: wchen47@brandeis.edu
Date: Oct 4 2016
Purpose of the program: use for loop and parameter to solve the problem of printing out the Fibonacci numbers
Bugs: None
*/

import java.util.*;

public class Problem6{
	public static void main(String[] args){

		//create the scanner object
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter a number which represents first n numbers in the Fibonacci numbers.");
		int enter = console.nextInt();

		//use the for loop
		for(int i = 0; i < enter; i++){
			System.out.println(compute(i));
		}

	}

	//create static  method
	public static int compute(int n){
		int num1 = 0;
		int num2 = 1;

		//use for loop to repeat
		for(int i = n; i > 0; i--){
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
		//return the result
		return num1;
	}
}