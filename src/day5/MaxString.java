package day5;

public class MaxString {

	public static void main(String[] args) {
		
		String name = "Mahindra Singh Dhoni";
		
		String[]words = name.split(" ");
		
		for(String s : words) {
			
			System.out.println(s);
		}
		
		String maxWord = " ";
		for (int i = 0 ; i < words.length ; i++) {
			
			if(words[i].length() > maxWord.length()) {
				
				maxWord = words[i];
			}
		}
		System.out.println(maxWord);
	}
}
