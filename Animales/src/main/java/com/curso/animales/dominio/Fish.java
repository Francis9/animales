package com.curso.animales.dominio;

public class Fish extends Animal implements Pet {
	private String name;

	public Fish() {
		super(0); 
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void play() {
		System.out.println("El pez juega en la pecera");
	}

	public void eat() {

		System.out.println("El pez come comida para peces");
	}

	
	public void walk() {
	
		System.out.println("El pez no anda, el pez nada");
	}
	
}