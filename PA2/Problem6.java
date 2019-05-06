/*Name: Chen Wenjing (Chen Chen showed on the Latte)
Email: wchen47@brandeis.edu
Date: Sep 20 2016
Purpose of the program: use scanner object and variables to solve the problem
Bugs: None
*/
import java.util.*;
public class Problem6{
	public static void main(String[] args){

		//create a scanner object
		Scanner console = new Scanner(System.in);
		System.out.println("How many cookies do you want?");
		
		//give the variables
		int cookies = console.nextInt();
		double sugar = 1.5 / 48;
		double butter = 1.0 / 48;
		double flour = 2.75 / 48;
		double cupsugar = cookies * sugar;
		double cupbutter = cookies * butter;
		double cupflour = cookies * flour;

		//2 decimal remained
		double cupsugar2 = (int)(cupsugar * 100)/ 100.0;
		double cupbutter2 = (int)(cupbutter * 100) / 100.0;
		double cupflour2 = (int)(cupflour * 100) / 100.0;

		// compute and print out
		System.out.println("You will need " + cupsugar2 + " cup(s) of sugar for your cookies;");
		System.out.println("You will need " + cupbutter2 + " cup(s) of butter for your cookies;");
		System.out.println("You will need " + cupflour2 + " cup(s) of flour for your cookies.");
	}
}