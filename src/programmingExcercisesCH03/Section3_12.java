package programmingExcercisesCH03;

import java.util.Scanner;

public class Section3_12 {

	public static void main(String[] args) {
		/*
		 * (Palindrome number) Write a program that prompts the user to enter a
		 * three-digit integer and determines whether it is a palindrome number. A
		 * number is palindrome if it reads the same from right to left and from left to
		 * right.
		 */

		System.out.println("Please enter 3 digits number");

		Scanner input = new Scanner(System.in);
		String threeDigits = input.nextLine();

		if (threeDigits.length() == 3) {
			if (threeDigits.substring(0, 1).equals(threeDigits.substring(2, 3))) {
				System.out.println(threeDigits + " is a palindrome");
			} else {
				System.out.println(threeDigits + " is not a palindrome");
			}
		} else {
			if (threeDigits.length() <= 1) {
				System.out
						.println("You entered " + threeDigits.length() + " digit number. Pease enter 3 digits number");
			} else {
				System.out
						.println("You entered " + threeDigits.length() + " digits number. Pease enter 3 digits number");
			}

		}
	}

}
