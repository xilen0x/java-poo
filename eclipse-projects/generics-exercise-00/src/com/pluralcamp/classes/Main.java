package com.pluralcamp.classes;

public class Main {
	
	public static void main(String [] args) {
		
		Person p1 = new Person("Josep", "Casacuberta");
		Person p2 = new Person("Maria", "Perez");
		
		Pair<Integer,Person> matricula1 = 
				new Pair<>(10237,p1);
		Pair<Integer,Person> matricula2 = new Pair<>(9753,p2);
		
		System.out.println(matricula1);
		System.out.println(matricula2.toString());
		
		Pair<Person,Double> nota1 = new Pair<>(p1, 6.8);
		System.out.println(nota1);
		
		Pair<String,Person> invitacion = 
				new Pair<>("657432198", p2);
		System.out.println(invitacion);	
		
	}
}
