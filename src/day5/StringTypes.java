package day5;

public class StringTypes {

	public static void main(String[] args) {
		
		System.out.println("normal String");
		String s = "Hello";
		System.out.println(s);
		System.out.println(s.hashCode());
		
		s = s.concat("wolrd");
		System.out.println(s);
		System.out.println(s.hashCode());
		
		StringBuilder sb = new StringBuilder("Hello Java");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		
		sb.insert(6 ,"What");
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
	}
}
