package com.markets.assignmentsExceptions.day3;
import java.util.Scanner;
public class Q5invalidage {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			System.out.print("Please enter the age of the voter::");
			int age =sc.nextInt();
			if(age<19) {
				throw new InvalidAgeException("Please enter the age greater than 19");
			}
			}catch(InvalidAgeException e) {
				System.out.println(""+ e.getMessage());
			}finally {
				System.out.println("In the final block!!!!");
				sc.close();
			}
			}
	}


