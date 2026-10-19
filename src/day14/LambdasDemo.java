package day14;

public class LambdasDemo {

//	static FInterface m2 = () -> System.out.println(greet);
	static String greet = "hello";
	static FInterface m2 = () ->{ System.out.println(greet);System.out.println("Thanks...");};
	
	public static void main(String[] args) {
		
		FInterface m1 = () -> System.out.println(greet);System.out.println("Thanks...");
		
		m1.print();
//		LambdasDemo obj = new LambdasDemo();
		
		m2.print();
	}
}
