package chapter05;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
   
		int num1 = (int) (Math.random()*10);
		int num2 = (int) (Math.random()*10);
		
		System.out.println("What is "+ num1 +" + "+num2 + "?");
		
		Scanner input = new Scanner(System.in);
		
		int answer = input.nextInt();
		
		while (num1+num2 != answer) {
			System.out.println("Wrong answer. Please try it again ");
			System.out.println("What is "+ num1 +" + "+num2 + "?");
			answer = input.nextInt();
		}
		System.out.println("Correct answer!"+"\n"+ num1 +" + "+num2 + " is "+answer);
	}
}
