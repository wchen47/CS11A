/*Name: Chen Wenjing (Chen Chen showed on the Latte)
Email: wchen47@brandeis.edu
Date: Oct 4 2016
Purpose of the program: use for loop and parameter to solve the problem
Bugs: None
*/

import java.util.*;

public class Problem2{
	public static void main(String[] args){

		// create a scanner object
		Scanner console = new Scanner(System.in);

		// ask the user to enter the first name and initialize a variable
		System.out.println("What is your first name?");
		String first = console.next();

		//aske the user to enter the last name and initialze a variable
		System.out.println("What is your last name?");
		String last = console.next();

		String s1 = lowerCase(first);
		String s2 = lowerCase(last);

		System.out.println( s1 + " " + s2);
	}


	public static String lowerCase(String name){
		String first = name.toLowerCase();


		//combine the String
		String s1 = first.substring(1) + first.substring(0,1);
		String s2 = s1.substring(0,1).toUpperCase() + s1.substring(1);
		String s3 = s2 + "ay ";


		//print out
		return s3;

 	}


}