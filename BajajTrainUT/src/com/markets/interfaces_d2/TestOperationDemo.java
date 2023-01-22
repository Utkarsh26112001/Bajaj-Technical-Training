package com.markets.interfaces_d2;

public class TestOperationDemo {
	public static void main(String[] args)
	{
		Operation ref;
		Demo obj= new Demo();
		ref=obj;
		ref.addition(10, 20);
		System.out.println(ref.division(100,200));
	}

}
