package day3 ;

import java.util.*;

public class PrimeCheck{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check if it is prime or not!!!");
		int num = sc.nextInt();
		boolean isPrime = true ;
		
		for (int i = 2 ; i*i <= num ; i++) {
			
			if(num % i == 0) {
				
				isPrime = false ;
				break ;
			}
		}
			
			if(isPrime) {
				
				System.out.println(num+" is a Prime Number...!!");
			}else {
				
				System.out.println(num+" aint Prime Number!!");
			}
		
	}
}