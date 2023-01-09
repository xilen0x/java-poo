package com.pluralcamp.labs.animals;

public class Cat {
	
	//ESTADO
	double weight; //en kg
	String color; //brown, white ...
	String size; //big, medium, small
	
	//COMPORTAMIENTO (BEHAVIOR)
	void salta() {
		System.out.println("El gato salta");
	}
	
	void lick() {
		System.out.println("El gato se lame");		
	}
	
	void duerme() {
		System.out.println("El gato duerme...");
	}
	
	void mew() {
		System.out.println("El gato hace miauuu");
	}
	
}
