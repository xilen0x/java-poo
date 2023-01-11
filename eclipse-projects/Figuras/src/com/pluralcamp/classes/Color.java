package com.pluralcamp.classes;

public class Color {

	// atributos
	private final int red;
	private final int green;
	private final int blue;
	
	public final static int MAX = 255;
	public static final int MIN = 0;

	public Color() { //Blanco
		this.red = Color.MAX;
		this.green = Color.MAX;
		this.blue = Color.MAX;
	}

	// Constructores
	public Color(int red, int green, int blue) {
		//red
		if (validaColor(red))		
			this.red = red;
		else 
			this.red = Color.MAX;
		//green
		if (validaColor(green))		
			this.green = green;
		else 
			this.green = Color.MAX;
		//blue
		if (validaColor(blue))		
			this.blue = blue;
		else 
			this.blue = Color.MAX;
	}

	//Helper method o método auxiliar NO FORMAN PARTE DEL COMPORTAMIENTO
	private boolean validaColor(int value) {
		if (value < Color.MIN || value > Color.MAX) {
			System.out.printf("Valor %d invalido %n", value);			
			return false;	//valor inválido		
		} else {
			return true; //valor válido
		}
	}
	
	// getters
	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

	public String toString() {
		return "(Red: " + this.red + " - Green: " + this.green + " - Blue: " + this.blue + ")";
	}

	// Behavior

}
