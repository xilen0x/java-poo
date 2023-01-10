package com.pluralcamp.app;

import com.pluralcamp.classes.Rectangle;
import com.pluralcamp.classes.Square;
import com.pluralcamp.classes.Circle;
import com.pluralcamp.classes.Sphere;

//java.lang

public class Main {
	
	public static void main(String[] args) {		
		
		//Cuadrado
		Square square = new Square(5.0);//side vale 5.0
		//square.side = 2.0;
		//square.setSide(5.0);//setter -- escribir
		double areaCuadrado = square.getArea();
		System.out.printf(
				"El area de un cuadrado de lado %.2f es: %.2f %n", 
				square.getSide(),areaCuadrado);
		
		//Cuadrado
		Square square2 = new Square(9.0);//side vale 5.0
		double areaCuadrado2 = square2.getArea();
		System.out.printf(
				"El area de un cuadrado de lado %.2f es: %.2f %n", 
				square2.getSide(),areaCuadrado2);		
		
		//Rectangulo
		Rectangle rectangle = new Rectangle(2.0, 3.0);//base vale 2.0
		//rectangle.base = -2.0; //Valor INVALIDO
//		rectangle.setBase(2.0);
//		rectangle.setHeight(3.0);
		System.out.printf(
				"El area de un rectangulo de base %.2f y altura %.2f es: %.2f %n", 
				rectangle.getBase(),rectangle.getHeight(),rectangle.getArea());
		
		//Circulo
		Circle circle = new Circle(5.5);//radio vale 5.0
		//circle.radius = 5.5;
		//circle.setRadius(5.5);
		System.out.printf("El area de un círculo de radio %.2f es: %.2f %n",
				circle.getRadius(), circle.getArea());
		
		//Esfera
		Sphere esfera = new Sphere(7.8);
		//esfera.radius = 7.8;
		//esfera.setRadius(7.8);
		System.out.printf("El volumen de una esfera de radio %.2f es: %.2f %n",
							esfera.getRadius(), esfera.getVolume());
		
		Sphere esfera2 = new Sphere();//radio 0.0
		//......
		esfera2.setRadius(7.9);
		
				
	}
	
}
