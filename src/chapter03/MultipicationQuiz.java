package chapter03;

import java.util.Random;
import java.util.Scanner;

public class MultipicationQuiz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Random rn = new Random();
		int number1 = rn.nextInt(10-2)+2; //Numbers between 2 (included) and 10 (not included)
		int number2 = rn.nextInt(7+2)+2; //Numbers between 2 (included) and 7 (not included)
		
		System.out.println("What is "+ number1 +" times "+ number2 +" ?");
		int answer = input.nextInt();
		
		System.out.println((number1 +" times "+ number2) + " = " +answer +" is " + (number1 * number2 == answer));
		
	}

}
