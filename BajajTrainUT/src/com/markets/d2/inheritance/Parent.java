package com.markets.d2.inheritance;

public class Parent {
	protected int p;
	public Parent()
	{
		System.out.println("Non Parameterized constructor");
	}
	public void display()
	{
		//p=10;
		System.out.println("Parent class Display\n");
	}
	public Parent(int p)
	{
		this.p=p;
		System.out.println("Parameterized Constructor");
	}

}
