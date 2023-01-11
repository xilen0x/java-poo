package com.pluralcamp.classes;

public class Circle {

	private double radius;
	private Color backgroundColor; //color de fondo
	private Color color; //color de las lineas o foreground color

	public Circle() {}
	
	public Circle(double radius) {
		this.setRadius(radius);
		System.out.printf("Círculo construido con radio igual a %f %n",
				this.getRadius());
	}

	// setter y getter (encapsulamiento)
	public void setRadius(double radius) {
		if (radius < 0) {
			System.out.println("Invalido");
		} else {
			this.radius = radius;
		}
	}

	public double getRadius() {
		return this.radius;
	}	

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

	// Comportamiento
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

}
