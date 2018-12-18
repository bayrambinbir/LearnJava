package programmingExcercisesCH03;

import java.util.Scanner;

public class Section3_6 {

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254;

        System.out.printf("Enter weight in pounds: ");
        double weight = in.nextDouble();
        System.out.printf("Enter feet: ");
        int feet = in.nextInt();
        System.out.printf("Enter inches: ");
        int inches = in.nextInt();
        int height = feet * inches;
        int totalInches = inches + (feet * 5);

        double bmi = (703 * weight) /(Math.pow(totalInches, 2));
        

        System.out.println("BMI is " + bmi);
        
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");


    }
}
