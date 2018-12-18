package chapter02;

import java.util.Scanner;

public class Celcius {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter Celcius to see FH");
		
		double fahrenheit = input.nextDouble();
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		
		System.out.println(fahrenheit + " fahrenheits " +celsius +" is "+ celsius);
	}

}
