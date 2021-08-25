package com.curso.animales.dominio;

public class Cat extends Animal {

	private String name;

	public Cat(String n) {
		super(4);
		name = n;
		}

	public Cat(int legs) {
		super(legs);

	}
	public Cat() {
		this("");
		}

	@Override
	public void eat() {
		System.out.println("El gato come comida para gatos");

	}
	
	public void play() {

		System.out.println("El gato esta jugando con su juguete");

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
}
