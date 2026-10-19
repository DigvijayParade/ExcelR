package day16;

import java.time.LocalDate;
import java.time.LocalTime;

public class TimenDate {

	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
	}
}
