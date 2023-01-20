package com.markets.assignments.day2;

public class Circle extends Shape{
	double radius;
	public Circle(double radius)
	{
		super("Circle");
		this.radius=radius;
		
	}
	public double calculateArea()
	{
		double area=Math.PI*radius*radius;
		return area;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

}
