package com.Exercise12oop.app;

import java.lang.Math;
import com.Exercise12oop.model.Shape;

import com.Exercise12oop.model.Circle;
import com.Exercise12oop.model.Square;
import com.Exercise12oop.model.Triangule;

import java.util.Scanner;

public class Shape{

	public static void main(String[] args) {
		
		Shape miforma = new Shape();
		int radio=0;
		
		Square square1 = new Square();
		Circle circle1 = new Circle();
		Triangule triangule = Triangule();
		
		
		Square square2 = new Square(10.2);
		Circle circle2 = new Circle(5.3);
		Triangule triangule2 = Triangule(5.4,6.8);

		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input the radio of the circle");
		radio = input.hasnextDouble();
		
		circle1.setRadio(radio);
		
		System.out.prinln("The area of the circle is: "+circle1.CalculateArea(circle1.getRadio));
				
		
	}

}
