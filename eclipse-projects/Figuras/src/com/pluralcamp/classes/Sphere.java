package com.pluralcamp.classes;

public class Sphere {
	
	private double radius;
	private Color color; //color de las lineas o foreground color
	
	public Sphere() {}
	
	public Sphere(double radius) {
		this.setRadius(radius);
		System.out.printf("Esfera construida con radio igual a %f %n",
				this.getRadius());
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {		
		if(radius < 0)
			System.out.println("Invalido");
		else
			this.radius = radius;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	//Behavior
	public double getVolume() {
		return (4.0/3.0) * Math.PI * radius * radius * radius;
	}
	
	public double getArea() {
		return 4 * Math.PI * Math.pow(this.radius,2);
	}
}
