package day7;

public abstract class Animal {

	private String name ;
	
	Animal(String n){
		
		name = n ;
	}
	
	void breed(String breed) {
		
		System.out.println("Type of Animel : "+breed);
	}
	
	abstract void makeSound();
}
