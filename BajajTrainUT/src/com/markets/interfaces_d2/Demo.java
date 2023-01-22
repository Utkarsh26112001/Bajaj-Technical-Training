package com.markets.interfaces_d2;

public class Demo implements Operation{

	@Override
	public void addition(int num1, int num2) {
		// TODO Auto-generated method stub
		int sum= num1+num2;
		System.out.println("Addition= "+ sum);
		
		
	}
	public int division(int num1, int num2)
	{
		return num1+num2+10;
	}
	
	
}
