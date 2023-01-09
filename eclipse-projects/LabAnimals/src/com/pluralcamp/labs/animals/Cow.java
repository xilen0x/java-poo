package com.pluralcamp.labs.animals;

public class Cow {
	
	//ESTADO
	double weight; //peso en Kg
	String color; //Color blanco, marron
	boolean lactant; //si da leche o no
	
	//COMPORTAMIENTO
	void come() {
		System.out.println("La vaca come");
	}
	
	void duerme() {
		System.out.println("La vaca duerme");
	}
	
	void daLeche() {
		System.out.println("La vaca da leche");
	}
	
	void muuu() {
		System.out.println("La vaca hace muuuu");
	}
	
}
