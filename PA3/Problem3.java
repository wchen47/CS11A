/*Name: Chen Wenjing (Chen Chen showed on the Latte)
Email: wchen47@brandeis.edu
Date: Oct 4 2016
Purpose of the program: use for loop and parameter to solve the problem
Bugs: None
*/

import java.util.*;

public class Problem3{
	public static void main(String[] args){

		//create the scanner object
		Scanner console = new Scanner(System.in);

		//ask the user to enter an integer and initialize the integer
		System.out.println("Please enter an integer.");
		int n = console.nextInt();


		for(int i = 0; i <= n; i++){
			System.out.println(compute(i));
		}

	}

	public static int compute(int n){
		int result = 1;
		for(int i = 1; i <= n; i++){
			result = result * 2;
		}
		return result;
	}

}