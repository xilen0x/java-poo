package com.pluralcamp.classes;

public class App {
	public static void main(String[] args) {
		
		Product p1 = new Product(Category.BOOKS, "ISBN 453890K");
		p1.setName("Java para todos");
		p1.setPrice(4.5f);
		
		System.out.println(p1.toString());
	}
}
