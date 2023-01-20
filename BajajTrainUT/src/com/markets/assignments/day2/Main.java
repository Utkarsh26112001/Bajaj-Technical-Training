package com.markets.assignments.day2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{	
		
		Scanner sc= new Scanner(System.in);
		System.out.println("FOR CALCULING AREA OF DIFFERENT SHAPES");
		System.out.println("****************************************");
		System.out.println("FOR SQUARE SELECT     :: 1");
		System.out.println("FOR RECTANGLE SELECT  :: 2");
		System.out.println("FOR CIRCLE SELECT     :: 3");
		System.out.println("TO EXIT THE CALCULATOR:: 4");
		System.out.println("PLease enter the number::");
		
		int number= sc.nextInt();
		switch(number) {
		case 1:

			System.out.print("Enter the side of the square::");
			int A= sc.nextInt();
			Square onj = new Square(A);
			double area=onj.calculateArea();
			System.out.println("The area of the Square is::"+ area);
			break;
			
		case 2:
			System.out.print("Enter the length of the Rectangle::");
			double B= sc.nextDouble();
			System.out.print("Enter the breadth of the Rectangle::");
			double D=sc.nextDouble();
			Rectangle obj1 = new Rectangle(B,D);
			double area1=obj1.calculateArea();
			System.out.println("The area of the Rectangle is::"+ area1);
			break;
		case 3:

			System.out.print("Enter the radius of the circle::");
			double C= sc.nextDouble();
			Circle obj = new Circle(C);
			double area2=obj.calculateArea();
			System.out.println("The area of the circle is::"+ area2);
			break;
			
		case 4:
			break;
		}
		sc.close();
		}

}
