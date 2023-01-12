package com.pluralcamp.classes;

public class Square extends Shape {

	private final double side; // 0.0

	// TODAS LAS CLASES TIENEN
	// UN CONSTRUCTOR POR DEFECTO
	// (QUE NO ES NECESARIO ESCRIBIR)
	// SOLO SI EL PROGRAMADOR/A NO
	// HA DEFINIDO SU PROPIO CONSTRUCTOR
	public Square(double side) {
		// INICIALIZACIÓN DEL ESTADO
		if (side < 0) {
			System.out.println("Valor inválido");
			this.side = 1.0;
		} else {
			this.side = side;
		}
		System.out.printf("Cuadrado construido con lado igual a %f %n", this.getSide());
	}

	public Square() {
		this.side = 1.0;
	}

	public Square(double side, Color backgroungColor, Color color) {
		if (side < 0) {
			System.out.println("Valor inválido");
			this.side = 1.0;
		} else {
			this.side = side;
		}
	}

	// setters i getters

	public double getSide() {
		return this.side;
	}

	// Behavior
//	public double getArea() {
//		return side * side;
//	}

	public double getPerimeter() {
		return this.side * 4;
	}
}
