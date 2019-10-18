package com.Exercise12oop.model;

public class Shape implements Shapeable, Somethingable{

	@Override
	public String Draw() {
		// TODO Auto-generated method stub
		return "Figure is geing erased";
	}

	@Override
	public String ChangeColor() {
		// TODO Auto-generated method stub
		return "Figure is been changed";
	}

	@Override
	public String Erase() {
		// TODO Auto-generated method stub
		return "Figure is been erased";
	}

	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}