package day3;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Enter num 1 : ");
		int num1 = sc.nextInt();		
		System.out.println("Enter num 2 : ");
		int num2 = sc.nextInt();
		
		int choice = 0 ;
		double result = 0.0 ;
		do {
			System.out.println("enter 1 for the add");
			System.out.println("enter 2 for the minus");
			System.out.println("enter 3 for the multiply");
			System.out.println("enter 4 for the division");
			System.out.println("enter 0 for the exit");
			System.out.println("Enter the choice : ");
			choice = sc.nextInt();
			if(choice <= 4 ) {
			switch(choice) {
			
			case 1 : result = num1 + num2 ;
				break ;
			case 2 : result = num1 - num2 ;
				break ;
			case 3 : result = num1 * num2 ;
				break ;
			case 4 : if(num2 != 0) {result = num1 / num2;} 
			else {System.out.println("Cant divide by zero");}
				break ;
			case 0 : System.out.println("Thanks Goodbye !!"); ;
				break ;
			}}
			else {System.out.println("Invalid choice");
			return ;}
			if(choice == 0) {
				System.out.println("------------------");
			}else
			System.out.println("Result : "+result);
			
		}while(choice != 0);
		
	}
}
