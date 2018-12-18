package programmingExcercisesCH03;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.DebugGraphics;

public class Section3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter integers for a,b and c");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		int discriminant = (int) Math.pow(b, 2) - (4 * a * c);
		double root1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		double root2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
     
		DecimalFormat df  = new DecimalFormat("#.##");
		if (discriminant == 0) {
			System.out.println("Your equation has 1 root which is " + root1);
		} else if (discriminant < 0) {
			System.out.println("Your equation does not have any real roots");
		} else {
			System.out.println("Your equation has 2 roots which are " + df.format(root1) + " and " + df.format(root2));
		}
	}

}
