package day7;

public class Dog extends Animal{

	Dog(String name) {
		
		super(name);
		
	}
	
	@Override
	void makeSound() {
		
		System.out.println("Woof...!");
	}
	public static void main(String[] args) {
		
		Dog d = new Dog("tommy");
		
		d.makeSound();
	}

	
}
