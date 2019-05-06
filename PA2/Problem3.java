/*Name: Chen Wenjing (Chen Chen showed on the Latte)
Email: wchen47@brandeis.edu
Date: Sep 20 2016
Purpose of the program: use scanner object and variables to solve the problem
Bugs: None
*/
import java.util.*;
public class Problem3 {
	public static void main(String[] args){
		
		//create a scanner object
		Scanner console = new Scanner (System.in);
		System.out.println("Enter price of item\n(from 25 cents to a dollar, in 5-cents increments)");

		//create and initialize the variables
		int item = console.nextInt();
		int change = 100 - item;
		int quarters = change / 25;
		int dimes = (change - quarters * 25) / 10;
		int nickels = (change - quarters * 25 - dimes * 10) / 5;

		//print out
		System.out.println("You bought an item for " + item + " cents and gave me a dollar, so your change is: ");
		System.out.println(quarters + " quarter(s),");
		System.out.println(dimes + " dime(s),");
		System.out.println(nickels + " nickel(s)");
	}
}
