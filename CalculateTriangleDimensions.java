/*
 * Programming Assignment 3: Triangular Calculations (Programming With Methods)
 * Bharat Khadka, Khadkab2
 */

import java.util.Scanner;

public class CalculateTriangleDimensions {

	public static void main(String[] args) {
		
		/*
		 * Name: Bharat
		 * User Name: Khadkab2
		 * Assignment: 3
		 *
		 * Description:
		 *    This program takes in the x and y coordinates of three separate points
		 *    specified by the user and returns the properties of the triangle created
		 *    by the three points. These properties include the length of each of the
		 *    sides, the angles of each corner, and the perimeter and area of the 
		 *    triangle.
		 *
		 * Bug Report:
		 *    This program will only work if the user provides valid inputs.
		 *    This program returns floating 0's in it's calculations. 
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the x-coordinate of the first corner point: ");
		String X1 = input.next();
		int x1 = getCoordinate(X1);
		
		System.out.print("Enter the y-coordinate of the first corner point: ");
		String Y1 = input.next();
		int y1 = getCoordinate(Y1);
		
		System.out.print("Enter the x-coordinate of the second corner point: ");
		String X2 = input.next();
		int x2 = getCoordinate(X2);
		
		System.out.print("Enter the y-coordinate of the second corner point: ");
		String Y2 = input.next();
		int y2 = getCoordinate(Y2);
		
		System.out.print("Enter the x-coordinate of the third corner point: ");
		String X3= input.next();
		int x3 = getCoordinate(X3);
		
		System.out.print("Enter the y-coordinate of the third corner point: ");
		String Y3 = input.next();
		int y3 = getCoordinate(Y3);
		
		System.out.println();
		
		
		double a = calcSideLength(x1, y1, x2, y2);
		double b = calcSideLength(x2, y2, x3, y3);
		double c = calcSideLength(x1, y1, x3, y3);
		
		double alpha = calcAlphaAngle(a, b, c);
		
		double beta = calcBetaAngle(a, b, c);

		double gamma = calcGammaAngle(a, b, c);
		
		double perimeter = calcPerimeter(a, b, c);
		
		double area = calcArea(a, b, c);
		
		System.out.printf("The lengths of the three sides of the triangle are %f, %f, and %f\n\n", a, b, c);
		
		System.out.printf("The three angles of the triangle are %f degrees, %f degrees, and %f degrees\n\n", alpha, beta, gamma);
		
		System.out.printf("The perimeter of the triangle is %f, and the area of the triangle is %f\n\n", perimeter, area);

	}
	
	public static int getCoordinate(String prompt){
		System.out.println(prompt);
		return Integer.valueOf(prompt);
	}
	
	public static double calcSideLength(int x1, int y1, int x2, int y2){
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}
	
	public static double calcAlphaAngle(double a, double b, double c){
		return Math.toDegrees( Math.acos( (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c) ) );
	}
	public static double calcBetaAngle(double a, double b, double c){
		return Math.toDegrees( Math.acos( (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c) ) );
	}
	public static double calcGammaAngle(double a, double b, double c){
		return Math.toDegrees( Math.acos( (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b) ) );
	}
	public static double calcPerimeter(double side1, double side2, double side3){
		return side1 + side2 + side3;
	}
	public static double calcArea(double a, double b, double c){
		double s = ((a + b + c) / 2.0);
		return (Math.sqrt(s * (s - a) * (s - b) * (s - c)));
	}
}
