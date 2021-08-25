package com.curso.animales;

import com.curso.animales.dominio.Animal;
import com.curso.animales.dominio.Cat;
import com.curso.animales.dominio.Fish;
import com.curso.animales.dominio.Pet;
import com.curso.animales.dominio.Spider;

public class Application {
	public static void main(String[] args) {
		
		Fish pez = new Fish();
		Cat gato = new Cat("Botas");
		Spider araña = new Spider();
		Animal ani1 = new Fish();
		Animal ani2 = new Spider();
		Animal ani3 = new Cat();
	
		
		pez.play();
		gato.play();
		araña.eat();
		araña.walk();
		gato.setName("Pancho");
		gato.getName();
		
		ani1.eat();
		ani1.walk();
		ani2.walk();
		
		gato.walk();
		
		
		
		
		
	}
}