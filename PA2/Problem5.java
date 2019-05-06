/*Name: Chen Wenjing (Chen Chen showed on the Latte)
Email: wchen47@brandeis.edu
Date: Sep 20 2016
Purpose of the program: use scanner object and variables to solve the problem
Bugs: None
*/
import java.util.*;
public class Problem5{
	public static void main(String[] args){

		// create a scanner object
		Scanner console = new Scanner(System.in);
		System.out.println("How many people join your party?");
		int people = console.nextInt();

		//give the number of people
		System.out.println("What is the size of pizza do you want? Please write in inches of the diameter.");
		double diameter = console.nextDouble();

		// compute
		double radius = diameter / 2;
		double area = 3.14 * radius * radius;
		double amount = (int) (people * 4 * 14.125 / area) + 1;

		// print out
		System.out.println("You need to purchase " + amount + " pizzas.");
	}
}