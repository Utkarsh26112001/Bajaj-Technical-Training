/*Division Program that accepts numerator and denominator*/

package com.markets.assignmentsExceptions.day3;
import java.util.Scanner;
public class TestException1 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("IN main Begin....");
		Q1division obj= new Q1division();
		System.out.print("Enter the numerator::");
		int a = sc.nextInt();
		System.out.print("Enter the Denominator::");
		int b = sc.nextInt();
		sc.close();
		obj.Division(a,b);
	}
}
