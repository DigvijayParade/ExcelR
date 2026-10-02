package day3;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");    
		int num=sc.nextInt();
		
		if (num <= 1) {
            System.out.println("Not a Prime");
            sc.close();
            return;
        }
		
		boolean isPrime = true ;
		
		for(int i = 2 ; i*i <= num ; i++ ) {
			
			if(num%i == 0) {
				
				isPrime = false ;
				break ;
			}
		}
		
		if(isPrime) {
			
			System.out.println(num+" is a Prime Number");
		}
		else {System.out.println("Not a Prime,Only a Prime can Defeat me !!");}
		
		
	}

}