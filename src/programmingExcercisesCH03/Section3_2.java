package programmingExcercisesCH03;

import java.util.Random;
import java.util.Scanner;

public class Section3_2 {

	public static void main(String[] args) {
		/*
		 * AdditionQuiz.java, generates two integers and prompts the user to enter the
		 * sum of these two integers. Revise the program to generate three single-digit
		 * integers and prompt the user to enter the sum of these three integers.
		 */

		Random rn = new Random();
		int num1 = rn.nextInt(999 - 100) + 100; // Numbers between 100 (included) and 999 (not included)
		int num2 = rn.nextInt(999 - 100 + 1) + 100; // Numbers between 100 (included) and 999 (included)
		int num3 = rn.nextInt(999 - 100) + 100;
		int total = num1 + num2 + num3;

		System.out.println("What is " + num1 + " + " + num2 + " + " + num3 + " ?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();

		if (answer == total) {
			System.out.println("Well done, " + num1 + " + " + num2 + " + " + num3 + " is " + total + ".");

		} else {
			System.out.println("Incorrect answer, " + num1 + " + " + num2 + " + " + num3 + " should be " + total + ".");
		}

	}

}
