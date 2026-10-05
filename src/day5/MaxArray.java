package day5;

public class MaxArray {

	public static void main(String[] args) {
		
		int[] arr = {10,20,53,4,85};
		
		int max = arr[0] ;
		
		for(int i = 0 ;i < arr.length ; i++) {
			
			if (max < arr[i]) {
				
				max = arr [i];
			}
		}
		System.out.println(max);
	}
}
