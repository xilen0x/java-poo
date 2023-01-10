package com.pluralcamp.classes;

public class Square {

	private double side; // 0.0
	private Color backgroundColor; //color de fondo
	private Color color; //color de las lineas o foreground color

	//TODAS LAS CLASES TIENEN
	//UN CONSTRUCTOR POR DEFECTO
	//(QUE NO ES NECESARIO ESCRIBIR)
	//SOLO SI EL PROGRAMADOR/A NO 
	//HA DEFINIDO SU PROPIO CONSTRUCTOR
	public Square(double side) {
		//INICIALIZACIÓN DEL ESTADO
		//this.side = side;
		this.setSide(side);
		System.out.printf("Cuadrado construido con lado igual a %f %n",
				this.getSide());
	}
	
	public Square() {}
	
	//setter
	public void setSide(double side) {
		if (side < 0) {
			System.out.println("Invalido");
		} else {
			this.side = side;
		}
	}
	
	//getter
	public double getSide() {
		return this.side;
	}
	
	public double getArea() {
		return side * side;
	}
}
