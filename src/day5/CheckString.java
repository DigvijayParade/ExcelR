package day5;

public class CheckString {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("racecar");
		String ogText = sb.toString();
		String text = sb.reverse().toString();
		
		System.out.println(ogText.equalsIgnoreCase(text));
	}
}
