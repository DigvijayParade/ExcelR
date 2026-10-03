package day3;

import java.util.Scanner;

public class Additon {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		int totalsum = 0 ;
		while(num > 0) {
			
			int lastDigit = num % 10 ;
			num = num / 10 ;
			totalsum +=  lastDigit;
			
			
		}
		System.out.println(totalsum);
		
	}
}
