package com.Exercise12oop.model;

import java.lang.Math;

public class Triangule extends Shape{
	
	private double base;
	private double height;
	
	public Triangule() 
	{
		
	}
	
	public Triangule(double base, double height)
	{
		this.base=base;
		this.height=height;
	}
	
	
	public double CalculateArea(double base, double height)
	{
		return (base*height)/2;
	}
	
	public double CalculatePerimeter(double base, double height)
	{
		return Math.sqrt(Math.pow(base, 2)+Math.pow(height, 2));
	}
	
	
	
	
	//Getters and Setters
	
	public double getBase()
	{
		return base;
	}
	
	public void setBase(double base)
	{
		this.base=base;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double height)
	{
		this.height=height;
	}
	
	

}
