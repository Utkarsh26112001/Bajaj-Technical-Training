package com.markets.assignmentsExceptions.day3;

public class Q3multiplecatchclause {
	public static String s;
	public static void main(String[] args) {
		try {
			s=null;
			System.out.println(s.length());
			int a[]= new int[6];
			a[6]=60/0;
			System.out.println(a[8]);
			
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
