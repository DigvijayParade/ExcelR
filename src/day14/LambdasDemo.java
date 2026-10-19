package day14;

public class LambdasDemo {

//	static FInterface m2 = () -> System.out.println(greet);
	static String greet = "hello";
	static FInterface m2 = () ->{ System.out.println(greet);System.out.println("Thanks...");};
	
	public static void main(String[] args) {
		
		FInterface m1 = () -> {System.out.println(greet);System.out.println("Thanks...");};
		
		m1.print();
//		LambdasDemo obj = new LambdasDemo();
		
		m2.print();
		
		System.out.println("Another one /////////////");
		
		Greet m3 = (n) -> System.out.println("Hello "+n);
		
		String name = "Gannu";
		m3.greet(name);
		
		System.out.println("Another one /////////////");
		
		Area m4 = r -> Math.PI*r*r;
		
		System.out.println(m4.area(10));
		
		System.out.println("Another one /////////////");
		
		Sample m5 = (o) -> {System.out.println(o.getName());System.out.println(o.getCity());};
		
		Details d1 = new Details("Nanu","Barshi");
		
		m5.display(d1);
	}
}
