package com.pluralcamp.labs.animals;

public class App {

	public static void main(String[] args) {
		
		System.out.println("---- GATO ----");
		Cat gato = new Cat();
		gato.mew();
		gato.lick();
		
		System.out.println("");
		System.out.println("---- VACA ----");
		Cow vaca = new Cow();
		vaca.daLeche();
		vaca.muuu();
		
		System.out.println("");
		System.out.println("---- PATO ----");
		Duck pato = new Duck();
		pato.come();
		pato.quack();
		
		System.out.println("");
		System.out.println("---- BACTERIA ----");
		Bactery bacteria = new Bactery();
		bacteria.come();
		bacteria.infecta();
	}

}
