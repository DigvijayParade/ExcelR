package day6;

import java.util.Scanner;

public class Student {

	private String stdName ;
	private int stdId ;
	
	public Student(String stdName, int stdId) {
		
		this.stdName = stdName ;
		this.stdId = stdId ;
		
	}
	public Student() {
		
		stdName = "Nanu" ;
		stdId = 101 ;
		
	}
	
	public void setName(String n) {
		
		this.stdName= n ;
	}
	
	public String getName() {
		
		return this.stdName;
	}
	
	public void seId(int i) {
		
		this.stdId= i ;
	}
	
	public int getId() {
		
		return this.stdId ;
	}
	
	public void acceptStd() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name : ");
		
		this.stdName = sc.nextLine();
		
		System.out.println("Enter Student ID : ");
		
		this.stdId = sc.nextInt();
	}
	
	public void displayStd() {
		
		System.out.println(stdName);
		System.out.println(stdId);
	}
	
	@Override
	public String toString() {
		
		return "Student Name : "+stdName+"||"+"Student ID : "+stdId ;
	}
	
}
