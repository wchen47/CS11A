/*Name: Chen Wenjing (Chen Chen showed on the Latte)
Email: wchen47@brandeis.edu
Date: Oct 23 2016
Purpose of the program: use if statement to solve the problem of getting the day of the date
Bugs: None
*/

// import the package
import java.util.*;

public class Problem4{
	public static void main(String[] args){
		// create a scanner object
		Scanner console = new Scanner(System.in);
		//ask the user to enter the year of the date
		System.out.print("Please enter the year of the date: ");
		//create and initialize the number
		int year = console.nextInt();
		//ask the user to enter the month of the date
		System.out.print("Please enter the month of the date: ");
		//create and initialize a word
		String month = console.next();
		//ask the user to enter the day of the date
		System.out.print("Please enter the day of the date: ");
		//create and initialize the day of the date
		int day = console.nextInt();
		//call the method
		compute(year, month, day);
	}


	// create another method
	public static void compute(int year, String month, int day){
		//create the number
		int days;
		// compute the number of the days
		if (month == "January"){
			days = day;
		} else if (month == "Feburary"){
			days = 31 + day;
		} else if (month == "March"){
			days = 31 + 28+ day;
		} else if (month == "April"){
			days = 31 + 28 + 31 + day;
		} else if (month == "May"){
			days = 31 + 28 + 31 + 30 + day;
		} else if (month == "June"){
			days = 31 + 28 + 31 + 30 + 31 + day;
		} else if (month == "July"){
			days = 31 + 28 + 31 + 30 + 31 + 30 + day;
		} else if (month == "August"){
			days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
		} else if (month == "September"){
			days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
		} else if (month == "October"){
			days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
		} else if (month == "November"){
			days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
		} else if (month == "December"){
			days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
		}

		//create and initialize the total days of teh year
		int totalDaysOfYear = 0;
		// use the for loop
		for (int i = 1601; i < year ; i ++){
			totalDaysOfYear += 365;
		}

		// create and initialize the days
		int totalDays = totalDaysOfYear + day;
		// find how many days was remained
		int restDays = totalDays % 7;
		// if statement to find out the specific day of the date
		if (restDays == 0){
			System.out.println("Sunday");
		} else if (restDays == 1){
			System.out.println("Monday");
		} else if (restDays == 2){
			System.out.println("Tuesday");
		} else if (restDays == 3){
			System.out.println("Wednesday");
		} else if (restDays == 4){
			System.out.println("Thursday");
		} else if (restDays == 5){
			System.out.println("Friday");
		} else if (restDays == 6){
			System.out.println("Saturday");
		}	
	}
}