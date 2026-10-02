package day3;

import java.util.Scanner;

public class Additon {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		int n4 = num % 10 ;
		num = num/10 ;
		
		int n3 = num % 10 ;
		num = num / 10 ;
		
		int n2 = num % 10 ;
		num = num /10 ;
		
		int n1 = num % 10 ;
		num = num/10 ;
		System.out.println();
		
		
		
		int totalSum = n1+n2+n3+n4 ;
		System.out.println(totalSum);
		
	}
}
