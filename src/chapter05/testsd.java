package chapter05;

import java.util.Random;
import java.util.Scanner;

public class testsd {

	public static void main(String[] args) {

		final int NUMBER_OF_QUESTIONS = 5;
		int correctCount = 0;
		int wrongCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();

		Scanner input = new Scanner(System.in);

		Random rn = new Random();

		while (count < NUMBER_OF_QUESTIONS) {
			int num1 = rn.nextInt(10 - 1 + 1) + 1;
			int num2 = rn.nextInt(10 - 1 + 1) + 1;
			System.out.println("What is " + num1 + " + " + num2 + "?");
			int answer = input.nextInt();
			count++;
			if (num1 + num2 == answer) {
				System.out.println("Correct");
				correctCount++;
			} else {
				System.out.println("Wrong");
				wrongCount++;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("You have " + correctCount + " correct, " + wrongCount + " incorrect");
		long totalSecondSpent = (endTime - startTime) / 1000;
		int totalMinute = (int) (totalSecondSpent/60);
		if(totalMinute>1) {
			System.out.println("TIME THAT YOU SPENT: " + totalMinute+" minutes and "+totalSecondSpent + " seconds."); 
		} else if ((totalMinute<1) && (totalSecondSpent>1)) {
			System.out.println("TIME THAT YOU SPENT: " + totalMinute+" minute and "+totalSecondSpent + " seconds."); 
		} else if ((totalMinute<1) && (totalSecondSpent<=1)) {
			System.out.println("TIME THAT YOU SPENT: " + totalMinute+" minute and "+totalSecondSpent + " second."); 
		}
		
	}

}
