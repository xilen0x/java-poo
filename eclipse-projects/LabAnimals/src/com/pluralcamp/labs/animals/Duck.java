package com.pluralcamp.labs.animals;

public class Duck {
	
	//ESTADO
	double weight; //peso en Kg
	String color; //Color del pato
	boolean isUgly; //El patito es feo o no
	
	
	//COMPORTAMIENTO
	void come() {
		System.out.println("El pato come");
	}
	
	void nada() {
		System.out.println("El pato nada");
	}
	
	void vuela() {
		System.out.println("El pato vuela");
	}
	
	void quack() {
		System.out.println("El pato hace quack quack");
	}
	
}
