package com.pluralcamp.classes;

public class Sphere {
	
	public double radius;
	
	public double getVolume() {
		return (4.0/3.0) * Math.PI * radius * radius * radius;
	}
}
