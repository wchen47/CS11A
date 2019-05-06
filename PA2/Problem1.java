/*Name: Chen Wenjing (Chen Chen showed on the Latte)
Email: wchen47@brandeis.edu
Date: Sep 20 2016
Purpose of the program: use scanner object and variables to solve the problem
Bugs: None
*/
import java.util.*;
public class Problem1{
	public static void main (String[] args){

		//create a scanner object
		Scanner console = new Scanner (System.in);
		System.out.println("please give me four-digit positive intergers");

		//create and initialize the variable
		int num1 = console.nextInt();
		int num2 = (num1 - num1 % 1000) / 1000;
		int num3 = (num1 % 1000 - num1 % 100) / 100;
		int num4 = (num1 % 100 - num1 % 10)/10;
		int num5 = num1 % 10;

		//print out
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
	}
}