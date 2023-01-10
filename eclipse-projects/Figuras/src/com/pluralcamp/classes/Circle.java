package com.pluralcamp.classes;

public class Circle {

	private double radius;

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

	// Comportamiento
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

}
