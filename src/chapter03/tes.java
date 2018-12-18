package chapter03;

import java.util.Random;
import java.util.Scanner;

public class tes {

	public static void main(String[] args) {
	
		// Get 2 numbers 5-30 
		// And subtract them
		// Ask question to user
		// Grade it
		Scanner input = new Scanner(System.in);
		Random rn = new Random();
		int num1 = rn.nextInt(30-5+1)+5;
		int num2 = rn.nextInt(30-5+1)+5;

		
		if (num1<num2) {
			int temp = num1;
			num1= num2;
			num2 = temp;
		}
		System.out.println("What is "+ num1 + " - "+ num2 + " ?");
		int answer = input.nextInt();
		
		if ((num1-num2) == answer) {
			System.out.println("Good job, your answer is correct. "+num1 +" - "+ num2+ " is "+(num1-num2)+".");
		} else {
			System.out.println("Incorrect answer. "+num1 +" - "+ num2+ " is "+(num1-num2)+".");	
		}

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num = sc.nextInt();
//		System.out.println((num % 2 == 0) ? "num is even" : "num is odd");
//		
	}

}
