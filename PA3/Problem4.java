/*Name: Chen Wenjing (Chen Chen showed on the Latte)
Email: wchen47@brandeis.edu
Date: Oct 4 2016
Purpose of the program: use parameter and static method to compute the total price
Bugs: None
*/

import java.util.*;

public class Problem4{
	public static void main(String[] args){

		//create a scanner object
		Scanner console = new Scanner(System.in);

		// ask the user to enter the name of the item and initialize the variable
		System.out.println("Input the name of the item1:");
		String item1 = console.next();

		//ask the user to enter the quantity of the item and initialize the variable
		System.out.println("Input the quantity of the item1:");
		int quantity1 = console.nextInt();

		//enter the price the single item and initialize the variable
		System.out.println("Input the price of the item1:");
		double price1 = console.nextDouble();

		// ask the user to enter the name of the item and initialize the variable
		System.out.println("Input the name of the item2:");
		String item2 = console.next();

		//ask the user to enter the quantity of the item and initialize the variable
		System.out.println("Input the quantity of the item2:");
		int quantity2 = console.nextInt();

		//enter the price the single item and initialize the variable
		System.out.println("Input the price of the item2:");
		double price2 = console.nextDouble();

		// ask the user to enter the name of the item and initialize the variable
		System.out.println("Input the name of the item3:");
		String item3 = console.next();

		//ask the user to enter the quantity of the item and initialize the variable
		System.out.println("Input the quantity of the item3:");
		int quantity3 = console.nextInt();

		//enter the price the single item and initialize the variable
		System.out.println("Input the price of the item3:");
		double price3 = console.nextDouble();


		// create and initialize the variable
		double total1 = quantity1 * price1;
		double total2 = quantity2 * price2;
		double total3 = quantity3 * price3;

		double subtotal = total1 + total2 + total3;
		double tax = subtotal * 0.0625;


		// print out
		System.out.println("Your bill:");

		System.out.printf("%-30s%-10s%-10s%-10s\n","Item","Quantity","Price","Total");

		print(item1, quantity1, price1, total1);
		print(item2, quantity2, price2, total2);
		print(item3, quantity3, price3, total3);
		
		System.out.printf("%-50s%-10.2f\n","Subtotal", subtotal);
		System.out.printf("%-50s%-10.2f\n","6.25% sales tax", 0.0625 * subtotal);
		System.out.printf("%-50s%-10.2f\n","Total", compute(tax,subtotal));

	}

	//static method to solve the problem of computing the total price
	public static double compute(double tax, double subtotal){

		double total = tax + subtotal;

		return total;
	}

	// static method to solve the problem of printing out
	public static void print(String item, int quantity, double price, double total){
		System.out.printf("%-30s%-10d%-10.2f%-10.2f\n", item, quantity, price, total); 
	}


}

