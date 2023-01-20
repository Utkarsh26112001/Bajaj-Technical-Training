package com.markets.assignments.day2;

public class Rectangle  extends Shape {
	double length;
	double breadth;
	
	public Rectangle(double length, double breadth) {
		super("Rectangle");
		this.breadth=breadth;
		this.length=length;			
	}
	public double calculateArea()
	{
		double area=length*breadth;
		return area;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
}

