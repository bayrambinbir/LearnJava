package programmingExcercisesCH03;

import java.util.Scanner;

public class Section3_5 {

	public static void main(String[] args) {
		/*
		 * (Find future dates) Write a program that prompts the user to enter an integer
		 * for today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6).
		 * Also prompt the user to enter the number of days after today for a future day
		 * and display the future day of the week.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter today's day. Ex Sunday=0, Monday=1, Tuesday=2 ...etc");
		int numberForToday = input.nextInt();

		System.out.println("Enter the number of days elapsed since today:");
		int numberForFutureDay = input.nextInt();

		String day = "";
		switch (numberForToday) {
		case 0:
			day = "Sunday";
			break;
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		default:
			break;
		}
		if ((numberForToday + numberForFutureDay) % 7 == 0) {
			System.out.println("Today is " + day + ". After " + numberForFutureDay + " day(s) the day will be Sunday.");
		} else if ((numberForToday + numberForFutureDay) % 7 == 1) {
			System.out.println("Today is " + day + ". After " + numberForFutureDay + " day(s) the day will be Monday.");
		} else if ((numberForToday + numberForFutureDay) % 7 == 2) {
			System.out.println("Today is " + day + ". After " + numberForFutureDay + " day(s) the day will be Tuesday.");
		} else if ((numberForToday + numberForFutureDay) % 7 == 3) {
			System.out
					.println("Today is " + day + ". After " + numberForFutureDay + " day(s) the day will be Wednesday.");
		} else if ((numberForToday + numberForFutureDay) % 7 == 4) {
			System.out.println("Today is " + day + ". After " + numberForFutureDay + " day(s) the day will be Thursday.");
		} else if ((numberForToday + numberForFutureDay) % 7 == 5) {
			System.out.println("Today is " + day + ". After " + numberForFutureDay + " day(s) the day will be Friday.");
		} else if ((numberForToday + numberForFutureDay) % 7 == 6) {
			System.out.println("Today is " + day + ". After " + numberForFutureDay + " day(s) the day will be Saturday.");
		}
	}
}
