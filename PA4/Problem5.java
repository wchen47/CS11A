/*Name: Chen Wenjing (Chen Chen showed on the Latte)
Email: wchen47@brandeis.edu
Date: Oct 23 2016
Purpose of the program: convert the number to Roman numerals by using the for loop and if statement
Bugs: None
*/

import java.util.*;

public class Problem5{
	public static void main(String[] args){
		// create the scanner object
		Scanner console = new Scanner(System.in);
		// aske the user to enter the number
		System.out.println("Please enter a number which is less than 4999: ");
		// initialize that number
		int num = console.nextInt();
		// call the method
		printout(num);

	}

	public static void printout(int num){
		// find the number of each digit 
		int num1 = (num - num % 1000) / 1000;
		int num2 = (num % 1000 - num % 100) / 100;
		int num3 = (num % 100 - num % 10)/10;
		int num4 = num % 10;
		// use the if statement to convert the 1000th digit number to Roman numerals
		if (num1 <= 4 && num1 > 0){
			for (int i = 1; i <= num1; i++){
				System.out.print("M");
			}
		}

		// convert the 100th digit number to Roman numerals
		if (num2 <=3){
			for (int i = 1; i <= num2; i ++){
				System.out.print("C");
			}
		}else if (num2 == 4){
			System.out.print("CD");
		}else if (num2 < 9 && num2 > 0){
			System.out.print("D");
			for (int i = 1; i <= num2 - 5; i++){
				System.out.print("C");
			}
		}else if (num2 == 9){
			System.out.print("CM");
		}
		//convert the number at the 10th digit
		if(num3 <= 3 && num3 > 0){
			//for loop to print out "X"
			for (int i = 1; i <= num3; i++){
				System.out.print("X");
			}
		// when number is 4, a new roman symbol to represent the number
		}else if (num3 == 4){
			System.out.print("XL");
		}else if (num3 < 9 && num3 > 0){
			System.out.print("L");
			for (int i = 1; i <= num3 - 5; i++){
				System.out.print("X");
			}
		}else if (num3 == 9){
			System.out.print("XC");
		}
		//conver the number at the last digit
		if(num4 <= 3 && num4 > 0){
			//for loop to print the "I"
			for (int i = 1; i <= num4; i++){
				System.out.print("I");
			}
			System.out.println();
		}else if(num4 == 4){
			System.out.println("IV");
		}else if (num4 < 9 && num4 > 0){
			System.out.print("V");
			// for loop to print the "I"
			for(int i = 1; i < num4 - 5; i++){
				System.out.print("I");
			}
		}else if (num4 == 9){
			System.out.print("IX");
		}
		//new line
		System.out.println();


	}
}