package com.Exercise12oop.model;

import java.lang.Math;

public class Circle extends Shape {
	
	private double radio;
	private double Pi=0;
	
	public Circle() 
	{
		
	}

	public Circle(double radio)
	{
		this.radio=radio;

	}


	public double CalculateArea(double radio)
	{
		return Math.PI*(Math.pow(radio, 2));
	}

	public double CalculatePerimeter(double radio)
	{
		return 2*Math.PI*radio;
	}




	//Getters and Setters

	public double getradio()
	{
		return radio;
	}

	public void setradio(double radio)
	{
		this.radio=radio;
	}


}
