package com.pluralcamp.classes;

public class Rectangle {

	private double base;
	private double height; // altura
	
	public Rectangle() {}
	
	public Rectangle(double base) {
		this.setBase(base);
	}
	
	public Rectangle(double base, double height) {
		//INICIALIZACIÓN DEL ESTADO	
		this.setBase(base);
		this.setHeight(height);
		System.out.printf("Rectangulo construido con"
				+ " base %f y altura %f %n",
				this.getBase(), this.getHeight());
	}

	// setter --> set seguido del nombre del
	// atributo primera letra en mayúscula
	public void setBase(double value) {
		if (value < 0) {
			System.out.println("Valor invalido");
		} else {
			base = value;
		}
	}
	
	public double getBase() {
		return this.base;
	}

	public void setHeight(double height) {
		if (height < 0) {
			System.out.println("Valor invalido");
		} else {
			this.height = height;
		}
	}
	
	public double getHeight() {
		return this.height;
	}

	public double getArea() {
		return base * height;
	}

}

class Trapecio { // default

}
