package com.pluralcamp.labs.animals;

public class Bactery {
	
	//ESTADO
	String tipo; //Tipo de bacteria
	String habitat;
	boolean isHarmful; //es peligrosa o beneficiosa
	
	//COMPORTAMIENTO
	void come() {
		System.out.println("La bacteria come");
	}
	
	void reproduce() {
		System.out.println("La bacteria se reproduce");
	}
	
	void infecta() {
		System.out.println("La bacteria infecta");
	}
	
}
