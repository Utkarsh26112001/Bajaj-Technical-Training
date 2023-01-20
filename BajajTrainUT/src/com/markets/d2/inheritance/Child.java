package com.markets.d2.inheritance;

public class Child extends Parent {
	int c;
	public Child(int c) {
		super(100);
		this.c=c;
		System.out.println("In child parameterized constructor");
	}
	public  Child()
	{
		System.out.println("Hello Bhai");
	}
	public void show()
	{
		
		System.out.println("In Child Show");
		
	}
	public void addition()
	{
		int sum=p+c;
		System.out.println("Sum= "+ sum);
	}
	public void display(){
		System.out.println("Child Display Method");
		
	}
	//@Override
	//public void putData() {
	//	System.out.println("In Child Putdata");
	//}
}
