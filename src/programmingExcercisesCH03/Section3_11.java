package programmingExcercisesCH03;

import java.util.Scanner;

public class Section3_11 {

	public static void main(String[] args) {
		/*
		 * (Find the number of days in a month) Write a program that prompts the user to
		 * enter the month and year and displays the number of days in the month. For
		 * example, if the user entered month 2 and year 2012, the program should
		 * display that February 2012 had 29 days. If the user entered month 3 and year
		 * 2015, the program should display that March 2015 had 31 days.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter month number: Ex: 1 for January, 2 for February... etc");
		int month = input.nextInt();
		System.out.println("Enter year: ");
		int year = input.nextInt();
		
		boolean  leapYear = ((year % 400 ==0) || ((year % 4 ==0) && (year % 100 !=0)));
		
		switch (month) {
		case 1:
			System.out.println("There are 31 days in January "+year+".");
			break;
		case 2:
			if (leapYear)
			System.out.println("There are 29 days in February "+year+".");
			else 
				System.out.println("There are 28 days in February "+year+".");
			break;
		case 3:
			System.out.println("There are 31 days in March "+year+".");
			break;
		case 4:
			System.out.println("There are 30 days in April "+year+".");
			break;
		case 5:
			System.out.println("There are 31 days in May "+year+".");
			break;
		case 6:
			System.out.println("There are 30 days in June "+year+".");
			break;
		case 7:
			System.out.println("There are 31 days in July "+year+".");
			break;
		case 8:
			System.out.println("There are 31 days in August "+year+".");
			break;
		case 9:
			System.out.println("There are 30 days in September "+year+".");
			break;
		case 10:
			System.out.println("There are 31 days in October "+year+".");
			break;
		case 11:
			System.out.println("There are 30 days in November "+year+".");
			break;
		case 12:
			System.out.println("There are 31 days in December "+year+".");
			break;
		default:
			break;
		}
		
	}

}
