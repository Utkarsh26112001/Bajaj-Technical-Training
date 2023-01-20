//Swap two numbers without using third variable.
package com.markets.assignments.day1;
import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args)
	{
		Problem3 prob3= new Problem3();
		Problem3.swap2();
	}
		static void swap2() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter 1st No::");
		int A= sc.nextInt();
		System.out.print("Enter 1st No::");
		int B=sc.nextInt();
		sc.close();
		A = A+B;
		B = A-B;
		A = A-B;
		System.out.println("New First Number::"+A+" \nNew Second Number::"+B);
		
	}

}
