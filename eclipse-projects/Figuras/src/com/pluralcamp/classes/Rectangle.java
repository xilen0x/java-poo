package com.pluralcamp.classes;

public class Rectangle {
	
	private double base;
	public double height; //altura	
	
	
	public void setBase(double value) {
		if(value < 0) {
			System.out.println("Valor invalido");			
		} else {
			base = value;
		}
	}
	
	public double getArea() {
		return base * height;
	}
	
}
