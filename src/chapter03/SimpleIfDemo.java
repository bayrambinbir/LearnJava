package chapter03;

import java.util.Scanner;

public class SimpleIfDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = input.nextInt();

		if ((number % 5 == 0) && (number % 2 == 0))
			System.out.println("The number that you entered is multiple of 2 and 5");

		if ((number % 5 == 0) && !(number % 2 == 0))
			System.out.println("The number that you entered is multiple of 5");

		if (!(number % 5 == 0) && (number % 2 == 0))
			System.out.println("The number that you entered is multiple of 2");

		if (!(number % 5 == 0) && !(number % 2 == 0))
			System.out.println("The number that you entered is not multiple of 2 or 5");
	}
}
