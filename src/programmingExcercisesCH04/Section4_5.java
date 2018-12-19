package programmingExcercisesCH04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Section4_5 {

	public static void main(String[] args) {
		/*
		 * Write a program that prompts the user to enter the number of sides and their
		 * length of a regular polygon and displays its area.
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		int numberOfSides = input.nextInt();
		System.out.print("Enter the side: ");
		double side = input.nextDouble();

		// Compute the area of a regular polygon
		double area = (numberOfSides * Math.pow(side, 2) / 
			(4 * Math.tan(Math.PI / numberOfSides)));

		DecimalFormat df = new DecimalFormat("#.##");
		// Display result
		System.out.println("The area of the polygon is " + df.format(area));
	}

}
