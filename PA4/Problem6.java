/*Name: Chen Wenjing (Chen Chen showed on the Latte)
Email: wchen47@brandeis.edu
Date: Oct 23 2016
Purpose of the program: use if statement and for loop to compute how many days remain for two different birthday and which person's birthday come first
Bugs: None
*/
import java.util.*;

public class Problem6{
	public static void main(String[] args){
		// create the scanner object
		Scanner console = new Scanner(System.in);
		//ask the user to enter the first person's birthday
		System.out.print("Please enter the month of 1st person birthday: ");
		// create and initialize the numer of the month
		int month1 = console.nextInt();
		// ask the user to enter the day of her birthday
		System.out.print("Please enter the day of his or her birthday: ");
		// create and initialize the number of the day
		int day1 = console.nextInt();
		//ask the user to enter the second person's birthday
		System.out.print("Please enter the month of 2nd person's birthday: ");
		//create and initialize the month of his or her birthday
		int month2 = console.nextInt();
		//ask the user to enter his or her day of the birthday
		System.out.print("Please enter the day of his or her birthday: ");
		//create and initialize the day of her or his birthday
		int day2 = console.nextInt();
		//ask the user to enter the month of today's date
		System.out.print("Please enter the month of today's date: ");
		//create and intialize the monthe of today's date
		int month = console.nextInt();
		// ask the user to enter the day of today's date
		System.out.print("Please enter the day of today's date: ");
		//crate and initialize the day of today's date
		int day = console.nextInt();
		// call the method
		compare(month1, day1, month2, day2, month, day );
	}
	// create another method
	public static void compare(int month1, int day1, int month2, int day2, int month, int day ){
		//create and initialize the number
		int result1 = 0;
		// for loop to get how many days between the Jan. 1st to 1st person's birthday
		for (int i = 1; i < month1; i ++){
			result1 += compute(i);

		}
		//create and initialize the number
		int totalDaysOfMonth1 = result1 + day1;

		//create and initialize the number
		int result2 = 0;
		// for loop to get how many days between the Jan. 1st to 2nd person's birthday
		for (int i = 1; i < month2; i++){
			result2 += compute(i); 
		}
		int totalDaysOfMonth2 = result2 + day2;

		//create and initialize the number
		int result = 0;
		// for loop to get how many days between the Jan. 1st to today's date
		for (int i = 1; i < month; i++){
			result += compute(i);
		}
		int totalDaysOfMonth = result + day;

		//get the remained days
		int remainDays1 = totalDaysOfMonth1 - totalDaysOfMonth;
		int remainDays2 = totalDaysOfMonth2 - totalDaysOfMonth;
		int remainDays11 = 365 - totalDaysOfMonth + totalDaysOfMonth1;
		int remainDays22 = 365 - totalDaysOfMonth + totalDaysOfMonth2;

		// if statement to print out how many days remained
		if (remainDays1 > 0){
			System.out.println(remainDays1 + " day(s) remain(s). ");
		}else if (remainDays1 < 0){
			System.out.println(remainDays11 + " day(s) remain(s).");
		}
		if(remainDays2 > 0){
			System.out.println(remainDays2 + " day(s) remain(s).");
		}else if (remainDays2 < 0){
			System.out.println(remainDays22 + " day(s) remain(s).");
		}

		// if statement to print out which person's birthday is sooner by dividing in different situations
		if(remainDays1 > 0 && remainDays2 > 0 && remainDays2 < remainDays1){
			System.out.println("2nd person's birthday is sooner.");
		}else if (remainDays1 > 0 && remainDays2 > 0 && remainDays2 > remainDays1){
			System.out.println("1st person's birthday is sooner.");
		
		}else if (remainDays1 < 0 && remainDays2 < 0 && remainDays22 > remainDays11 ){
			System.out.println("1st person's birthday is sooner.");
		}else if (remainDays1 < 0 && remainDays2 < 0 && remainDays22 < remainDays11){
			System.out.println("2nd person's birthday is sooner.");

		}else if (remainDays1 > 0 && remainDays2 < 0 && remainDays1 > remainDays22 ){
			System.out.println("2nd person's birthday is sooner.");
		}else if (remainDays1 > 0 && remainDays2 < 0 && remainDays1 < remainDays22 ){
			System.out.println("1st person's birthday is sooner.");

		}else if (remainDays1 < 0 && remainDays2 > 0 && remainDays2 > remainDays11){
			System.out.println("1st person's birthday is sooner");
		}else if (remainDays1 < 0 && remainDays2 > 0 && remainDays2 < remainDays11){
			System.out.println("2nd person's birthday is sooner");
		}
	}
	// create a new method
	public static int compute(int month){
		//if statement to return the days of the month
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			int totalDays = 31;
			return totalDays;
		}else if(month == 2){
			int totalDays = 28;
			return totalDays;
		}else {
			int totalDays = 30;
			return totalDays;
		}

	}






}