package day3 ;

import java.util.*;

public class Addition{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ur number..");
		
		int num = sc.nextInt();
		int lastDigit = 0 ;
		while(num != 0){
		lastDigit = num % 10 ;
		num = num/10 ;
		lastDigit += lastDigit ;
		}
		
		
		System.out.println(lastDigit);
	}
}