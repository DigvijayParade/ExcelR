package day5 ;

public class ReverseString{
	
	public static void main(String[] args) {
		
		String og = "Digvijay Parade";
		
		String rev = "";
		
		for(int i = og.length()-1 ; i >= 0 ; i--) {
			
			rev += og.charAt(i);
		}
		
		System.out.println(rev);
		
		StringBuilder sb = new StringBuilder(og);
		
		String anothe = sb.reverse().toString();
		
		System.out.println(anothe);
	}
}