package excelR.course.day2;

import java.util.Scanner;

public class AgeVerify {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ur Age : ");
		int age = Integer.parseInt(sc.nextLine());
		
		if (age >= 18 && age < 100) {
			
			System.out.println("Your an adult....");
		}
		else if (age <= 18 && age > 0) {
			
			System.out.println("Youre not an adult yet.....");
		}
	}
}
