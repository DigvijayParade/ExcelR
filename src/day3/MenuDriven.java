package day3;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number 1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter number 2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		System.out.println("0 for the Exit");
		double result = 0.0 ;
		System.out.println("Enter Choice : ");
		int choice = 0 ;
		do {
		
			choice = sc.nextInt();
		switch(choice) {
			case 1 : result = num1 + num2 ;
					break ;
			case 2 : result = num1 - num2 ;
			break ;
			case 3 : result = num1 * num2 ;
			break ;
			case 4 : result = num1 / num2 ;
			break ;
			case 0 : break ;
		}
		System.out.println(result);
		}while(choice != 0);
		
	}
}
