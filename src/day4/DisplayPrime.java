package day4;

public class DisplayPrime {

	public static void main(String[] args) {
		
		int arr [] = {23,18,15,40,29};
		
		for(int i = 0 ; i < arr.length - 1;i++) {
			
			int num = arr[i];
			int flag = 0 ;
			
			for(int  j= 2 ; j <= Math.sqrt(num);j++) {
				
				if(num % j == 0) {
					
					System.out.println("Prime Number "+num);
				}
			}
		}
	}
}
