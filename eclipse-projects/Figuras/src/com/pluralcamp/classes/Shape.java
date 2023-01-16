package com.pluralcamp.classes;

public class Shape {
	
	private Color backgroundColor; // color de fondo
	private Color color; // color de las lineas o foreground color
		
	//seters and getters
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	//Behavior
	public double getArea() {
		return 1.0;
	}
}
