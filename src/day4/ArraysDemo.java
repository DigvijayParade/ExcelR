package day4;

import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int arr [] =new int[5];
		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.println("Enter a Number");
			arr[i] = sc.nextInt();
		}
		
		for(int j : arr) {System.out.println(j);}
	}
}
