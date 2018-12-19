package chapter04;

import java.util.Scanner;

public class OrderTwoCities {
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//
//		// Prompt the user to enter two cities
//		System.out.print("Enter the first city: ");
//		String city1 = input.nextLine();
//		System.out.print("Enter the second city: ");
//		String city2 = input.nextLine();
//
//		if (city1.compareTo(city2) < 0)
//			System.out.println("The cities in alphabetical order are " + city1 + " , " + city2);
//		else if (city1.compareTo(city2) > 0)
//			System.out.println("The cities in alphabetical order are " + city2 + " , " + city1);
//		else 
//			System.out.println("These cities  are in same alphabetical order");
//		
////    if (city1.compareToIgnoreCase(city2) < 0) { // you can use compareToIgnoreCase() if you do not care about case sensitivity
////        System.out.println("The cities in alphabetical order are " +
////           city1 + " , " + city2);
////    } else if (city1.compareToIgnoreCase(city2) > 0){
////        System.out.println("The cities in alphabetical order are " +
////            city2 + " , " + city1);
////      } else {
////    	  System.out.println("These cities  are in same alphabetical order");
////      }
		
		String s1 = "Welcome to Java";
		String s2 = "Programming is fun";
		String s3 = "Welcome to Java";
		System.out.println(s1==s3);
	}
}
