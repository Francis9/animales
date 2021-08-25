package com.curso.animales.dominio;

public abstract class Animal {

	protected int legs;
	
	public Animal(int legs) {
		
		this.legs = legs;	
	}
	
	public void walk() {
		
		System.out.println("El animal de "+ this.legs + " patas esta andando");
	}
	
	public abstract void eat();
}
