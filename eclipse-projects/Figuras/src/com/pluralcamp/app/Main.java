package com.pluralcamp.app;

import com.pluralcamp.classes.Rectangle;
import com.pluralcamp.classes.Square;
import com.pluralcamp.classes.Circle;
import com.pluralcamp.classes.Sphere;

//java.lang

public class Main {
	
	public static void main(String[] args) {
		
		//Cuadrado
		Square square = new Square();//side vale 0.0
		square.side = 2.0;
		double areaCuadrado = square.getArea();
		System.out.println("El area es: " + areaCuadrado);
		
		//Rectangulo
		Rectangle rectangle = new Rectangle();//base vale 0.0
		//rectangle.base = -2.0; //Valor INVALIDO
		rectangle.setBase(-2.0);
		rectangle.height = 3.0;
		System.out.println("El area es: " + rectangle.getArea());
		
		//Circulo
		Circle circle = new Circle();//radio vale 0.0
		circle.radius = 5.5;
		System.out.println("El area es: " + circle.getArea());
		
		//Esfera
		Sphere esfera = new Sphere();
		esfera.radius = 7.8;
		System.out.println("El volumen es: " + esfera.getVolume());
				
	}
}
