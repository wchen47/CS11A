/*Name: Chen Wenjing (Chen Chen showed on the Latte)
Email: wchen47@brandeis.edu
Date: Sep 20 2016
Purpose of the program: use variable to solve the problem
Bugs: None
*/
import java.util.*;
public class Problem4{
	public static void main(String[] args){

		//create scanner object
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter the diameter of the pizza in inches");

		//create and initialize the variables
		int diameter = console.nextInt();
		double radius = diameter / 2;
		double area = 3.14 * radius * radius;
		int slice = (int)(area / 14.125);

		//compute and print out
		System.out.println("This pizza has " + slice + " slices.");
	}
}