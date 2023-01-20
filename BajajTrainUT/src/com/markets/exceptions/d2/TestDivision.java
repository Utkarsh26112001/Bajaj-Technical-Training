package com.markets.exceptions.d2;

public class TestDivision {
	public static void main(String[] args)
	{
		System.out.println("IN main Begin....");
		Division obj= new Division();
		obj.division(10,0);//If we use 5 in place of 0 then we will not have any error.
		obj.justfun();
		System.out.println("IN MAIN END....");
	}

}
