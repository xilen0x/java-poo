package com.pluralcamp.classes;

public class Square {

	private final double side; // 0.0
	private final Color backgroundColor; // color de fondo
	private final Color color; // color de las lineas o foreground color

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
		this.backgroundColor = new Color();
		this.color = new Color();
		System.out.printf("Cuadrado construido con lado igual a %f %n", this.getSide());
	}

	public Square() {
		this.side = 1.0;
		this.backgroundColor = new Color();
		this.color = new Color();
	}

	public Square(double side, Color backgroungColor, Color color) {
		if (side < 0) {
			System.out.println("Valor inválido");
			this.side = 1.0;
		} else {
			this.side = side;
		}
		this.backgroundColor = backgroungColor;
		this.color = color;
	}

	// setters i getters

	public double getSide() {
		return this.side;
	}

	public Color getBackgroundColor() {
		return backgroundColor;
	}

	public Color getColor() {
		return color;
	}

	// Behavior
	public double getArea() {
		return side * side;
	}

	public double getPerimeter() {
		return this.side * 4;
	}
}
