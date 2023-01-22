package com.markets.assignmentsExceptions.day3;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Q7explicitly {
	public static void main(String[] args) {
		try {
			throwNullPointerException();
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
			throwFileNotFoundException();
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
			throwArithmeticException();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	@SuppressWarnings("null")
	public static void throwNullPointerException() throws NullPointerException{
			String s= null;
			System.out.println(s.length());
	}
	@SuppressWarnings({ "unused", "resource" })
	public static void throwFileNotFoundException() throws FileNotFoundException {
		FileReader fileReader = new FileReader(".txt");
	}

	public static void throwArithmeticException()  throws ArithmeticException{
		System.out.println(40/0);
		
	}

}
