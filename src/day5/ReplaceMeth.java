package day5;

public class ReplaceMeth {

	public static void main(String[] args) {
		
		String text = "I Love Dogesh Bhai , Dogesh bhai is Cute";
		System.out.println(text);
		
		text = text.replace("Dogesh","Catesh");
		
		System.out.println(text);
		
		System.out.println("REplaceAll");
		
		String code = "4aef15ae15aeff9456";
		
		code = code.replaceAll("[1-9]", "x");
		
		System.out.println(code);
	}
}
