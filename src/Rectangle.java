
public class Rectangle {

	public static void main(String[] args) {
		/*
		 * Q1) Create a class Rectangle. Create two variables length and breadth in it.
		 * Calculate the Perimeter and area of rectangle using formula given below and
		 * print it
		 * 
		 * Perimeter formula P=2(length+breadth) Area of Rectangle Area = length X
		 * breadth
		 * 
		 * Q2) Create a class which will do following operations on two numbers : 
		 * a.addition b.substraction c.multiplication
		 */

		// Question1: Perimeter and area of rectangle
		int rectangleLength = 10;
		int rectangleBreadth = 20;

		int area = rectangleLength * rectangleBreadth;
		int perimeter = 2 * (rectangleLength + rectangleBreadth);

		System.out.println("Area of a rectangle : " + area);
		System.out.println("Perimeter of a rectangle : " + perimeter);

		// Question2: a.addition b.substraction c.multiplication
		int num1 = 400;
		int num2 = 200;

		int addition = num1 + num2;
		int subtraction = num1 - num2;
		int multiplication = num1 * num2;

		System.out.println("Addition of two numbers : " + addition);
		System.out.println("Subtraction of two numbers : " + subtraction);
		System.out.println("Multiplication of two numbers : " + multiplication);

	}

}
