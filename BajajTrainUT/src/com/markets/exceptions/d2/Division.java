package com.markets.exceptions.d2;

public class Division {
	public void division(int num1, int num2)
	{
		//try and catch are used for handling the exception....
		try {
		System.out.println("IN Division");
		int div=num1/num2;
		System.out.println("Division= " +div);
		}
		catch(Exception e)
		{
			System.out.println("" +e);
		}
		System.out.println("Division Done..");
		
		
	}
	public void justfun() {
		try {
		System.out.println("IN Just FUN");
		Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();//For handling the run time error in byte time 1000
		}
		finally {
			System.out.println("In The Finally......");
		}
	}
}
