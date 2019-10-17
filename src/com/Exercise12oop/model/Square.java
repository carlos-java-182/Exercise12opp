package com.Exercise12oop.model;

public class Square extends Shape{
	
	private double lado;
	
	public Square() 
	{
		
	}
	
	public Square(double lado)
	{
		
		this.lado=lado;
	
	}
	
	
	public double CalculateArea(double lado)
	{
		return (lado*lado);
	}
	
	public double CalculatePerimeter(double lado)
	{
		return (lado*4);
	}
	
	
	
	
	//Getters and Setters
	
	public double getLado()
	{
		return lado;
	}
	
	public void setBase(double lado)
	{
		this.lado=lado;
	}


	
	
}
