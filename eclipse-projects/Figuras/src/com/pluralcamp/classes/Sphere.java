package com.pluralcamp.classes;

public class Sphere {
	
	private double radius;
	
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


	public double getVolume() {
		return (4.0/3.0) * Math.PI * radius * radius * radius;
	}
}
