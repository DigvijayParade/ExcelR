package day3;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st Num : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd Num : ");
		int num2 = sc.nextInt();
		
		double result = 0.0 ;
		int choice = 0 ;
		do {
			
			System.out.println("Enter 1 for the add");
			System.out.println("Enter 2 for the minus");
			System.out.println("Enter 3 for the Multi");
			System.out.println("Enter 4 for the divide");
			System.out.println("Enter 0 for the Exit");
			
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
			case 0 : System.out.println("Thank u goodbye "); System.exit(0);
			break ;
			}
			System.out.println("//////////////////");
			System.out.println(result);
			
		}
		
		while(choice != 0);
		
	}
}
