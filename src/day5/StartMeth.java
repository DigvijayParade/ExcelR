package day5;

public class StartMeth {

	public static void main(String[] args) {
		
		String text = "Hello Moto";
		
		System.out.println(text.startsWith("Hello"));
		System.out.println(text.endsWith("nanu"));
		
		String some = text.substring(6, 10);
		System.out.println(some);
	}
}
