package chapter03;

import java.util.Random;
import java.util.Scanner;

public class AdditionQuiz {
	public static void main(String[] args) {

		Random rn = new Random(); // This is going to create random numbers in Java
		// int number1= rn.nextInt(a-b)+b; // Numbers between a (included) and b (not included)
		// int number2 = rn.nextInt(3-2)+2; Numbers between 2 (included) and 3 (not included)
		// int number3 = rn.nextInt(a)+b; // Numbers between a (included) and (a+b)-1
		// int number4 = rn.nextInt(5)+4; // Numbers between 4 (included) and (5+4)-1

		int number1 = rn.nextInt(10-5) + 5; // Numbers between 5 (included) and 10 (not included)

		int number2 = rn.nextInt(5 - 2) + 2; // Numbers between 2 (included) and 5 (not included)

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("What is " + number1 + " + " + number2 + "? ");
       

		int answer = input.nextInt();

		if (answer!=(number1 + number2)) {
			System.out.print("Your answer is incorrect. ");
			System.out.println(number1 + " + " + number2 + " should be "+(number1 + number2)+".");
			
		} else {
			System.out.println("Well Done");
			System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
		}

	}
}
