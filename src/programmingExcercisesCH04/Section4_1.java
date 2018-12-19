package programmingExcercisesCH04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Section4_1 {

	public static void main(String[] args) {
		/*
		 * (Geometry: area of a pentagon) Write a program that prompts the user to enter
		 * the length from the center of a pentagon to a vertex and computes the area of
		 * the pentagon
		 */
		System.out.println("Enter the length from the center to a vertex:");

		Scanner input = new Scanner(System.in);
		double length = input.nextDouble();

		double s = (2 * length) * (Math.sin(Math.PI / 5));
		double area = (5 * Math.pow(s, 2)) / (4 * (Math.tan(Math.PI / 5)));

		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("The are of pentagon is " + df.format(area));

	}

}
