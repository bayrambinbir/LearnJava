package programmingExcercisesCH03;

import java.util.Random;
import java.util.Scanner;

public class Section3_4 {

	public static void main(String[] args) {

		/*
		 * (Random month) Write a program that randomly generates an integer between 1
		 * and 12 and displays the English month name January, February, …, December for
		 * the number 1, 2, …, 12, accordingly.
		 */
		Random rn = new Random();
		int numberForMonth = rn.nextInt(12 + 1 - 1) + 1;

		switch (numberForMonth) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			break;
			
		}
		System.out.println("Number for this month is: "+numberForMonth);
	}

}
