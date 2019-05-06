/*Name: Chen Wenjing (Chen Chen showed on the Latte)
Email: wchen47@brandeis.edu
Date: Oct 23 2016
Purpose of the program: to print out a picture by using the for loop
Bugs: None
*/

public class Problem2{
	public static void main(String[] agrs){
		// call the method
		print();
	}

	public static void print(){

		// use the for loop first time to print out the lines
		for(int i = 5; i >= 0; i --){
			//use the for loop to prin the stars
			for (int j = i; j >= 1; j--){
				System.out.print("*");
			}
			// use the for loop to print out the space
			for (int j = 5; j >= i; j--){
				System.out.print(" ");
			}
			// print out the "//"
			for(int j = i; j >= 1; j--){
				System.out.print("//");
			}
			// print out "\\"
			for(int j = 5; j > i; j--){
				System.out.print("\\\\");
			}
			// print out space
			for (int j = 5; j >= i; j--){
				System.out.print(" ");
			}
			// print out the stars
			for (int j = i; j >= 1; j--){
				System.out.print("*");
			}
			// new line
			System.out.println();
		}
	}
}