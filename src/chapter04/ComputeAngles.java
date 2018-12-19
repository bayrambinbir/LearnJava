package chapter04;

import java.util.Scanner;

public class ComputeAngles {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Prompt the user to enter three points
//    System.out.print("Enter three points: ");
//    double x1 = input.nextDouble();
//    double y1 = input.nextDouble();
//    double x2 = input.nextDouble();
//    double y2 = input.nextDouble();
//    double x3 = input.nextDouble();
//    double y3 = input.nextDouble();
//    
//    // Compute three sides
//    double a = Math.sqrt((x2 - x3) * (x2 - x3) 
//        + (y2 - y3) * (y2 - y3));
//    double b = Math.sqrt((x1 - x3) * (x1 - x3) 
//        + (y1 - y3) * (y1 - y3));
//    double c = Math.sqrt((x1 - x2) * (x1 - x2) 
//        + (y1 - y2) * (y1 - y2));
//    
//    // Compute three angles
//    double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) 
//        / (-2 * b * c)));
//    double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) 
//        / (-2 * a * c)));
//    double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) 
//        / (-2 * a * b)));
//    
//    // Display results
//    System.out.println("The three angles are " + 
//        Math.round(A * 100) / 100.0 + " " +
//        Math.round(B * 100) / 100.0 + " " + 
//        Math.round(C * 100) / 100.0);
    System.out.println("isLowerCase('a') is "
    		+ Character.isLowerCase('a'));
    		System.out.println("isUpperCase('a') is "
    		+ Character.isUpperCase('a'));
    		System.out.println("toLowerCase('T') is "
    		+ Character.toLowerCase('T'));
    		System.out.println("toUpperCase('q') is "
    		+ Character.toUpperCase('q'));
    		String a ="bayram";
    		
    		char b = a.charAt(0);
    		System.out.println(Character.toUpperCase(b)+a.substring(1, a.length()));
    		System.out.println(a.substring(0,1).toUpperCase()+a.substring(1,a.length()));
    		
    		String c = "Bayram";
    		char k = 'k';
    		int kk = k;
    		char K = 'K';
    		int KK = K;
    		
    		
    		System.out.println(KK);
    		System.out.println(kk);
    		
    		System.out.println(a.equalsIgnoreCase(c));  // true
    		System.out.println(a.equals(c));  // false
    		System.out.println(a.compareTo(c));
  }
}
