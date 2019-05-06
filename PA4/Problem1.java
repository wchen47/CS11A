/*Name: Chen Wenjing (Chen Chen showed on the Latte)
Email: wchen47@brandeis.edu
Date: Oct 23 2016
Purpose of the program: use the if statement and for loop to solve the problem of converting binary number to decimal number
Bugs: None
*/

import java.util.*;

public class Problem1{
	public static void main(String[] args){

		//use the scanner object 
		Scanner console = new Scanner(System.in);
		//print out the sentence to ask the user to enter the number
		System.out.println("Please enter a binary number");
		// create and initialize the number
		String s1 = console.next();
		// call the method
		compute(s1);
	}

	//create a new method to compute
	public static void compute(String s1){
		//create and initialize a number
		int result = 0;

		//use the for loop
		for(int i = 0; i < s1.length(); i++){
			//if statement
			if(s1.charAt(i)=='1'){
				int comp = 1;
				//nested a for loop
				for(int j = 0; j < s1.length() - i - 1; j++){
					// formula of computing
					comp *= 2;
				}
				// getting the result
				result += comp;	
			}	
		}
		System.out.println(result);
	}
}