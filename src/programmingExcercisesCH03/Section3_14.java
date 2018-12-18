package programmingExcercisesCH03;

import java.util.Random;
import java.util.Scanner;

public class Section3_14 {

	public static void main(String[] args) {
		/*
		 * (Game: heads or tails) Write a program that lets the user guess whether the
		 * flip of a coin results in heads or tails. The program randomly generates an
		 * integer 0 or 1, which represents head or tail. The program prompts the user
		 * to enter a guess and reports whether the guess is correct or incorrect.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 for head OR 0 for tail ");

		int numbers = (int) (Math.random() * 2); // OR
//		Random rn = new Random();
//		int numbers= rn.nextInt(2-1)+1;

		int userChoice = input.nextInt();
		String tailOrHead = "";

		switch (userChoice) {
		case 0:
			tailOrHead = "Tail";
			break;
		case 1:
			tailOrHead = "Head";
			break;
		default:
			break;
		}
		if (userChoice == numbers) {
			System.out.println(
					"Good job. Your guess was correct! Your selected " + userChoice + " for " + tailOrHead+ " which is correct!");

		} else {
			switch (userChoice) {
			case 0:
				tailOrHead = "Head";
				break;
			case 1:
				tailOrHead = "Tail";
				break;
			default:
				break;
			}
			System.out.println(
					"Sorry. Your guess was Incorrect! You selected " + userChoice + " for " + tailOrHead+ " which is wrong!");
		}

	}

}
