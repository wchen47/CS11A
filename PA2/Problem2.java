/*Name: Chen Wenjing (Chen Chen showed on the Latte)
Email: wchen47@brandeis.edu
Date: Sep 20 2016
Purpose of the program: use scanner object and variables to solve the problem
Bugs: None
*/
import java.util.*;
public class Problem2{
	public static void main(String[] args){
		// create a scanner object
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a temperature in degrees Fahrenheit without fractional part: ");
		int degreesF = console.nextInt();

		//give and initialize the variable
		double degreesC = 5 * (degreesF - 32) / 9.0;

		// 1 decimal remained
		double degreesC1 = (int)(degreesC * 10) / 10.0;

		System.out.println(degreesF + " degrees Fahrenheit is " + degreesC1 + " degrees Celsius.");
	}
}
