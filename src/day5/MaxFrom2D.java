package day5;

public class MaxFrom2D {

	public static void main(String[] args) {
		
		int[][] matrix = {
				
				{3, 8, 1, 5},
	            {12, 45, 9, 21},
	            {100, 2, 75, 40}
	            
		};
		
		for(int row = 0 ; row < matrix.length ; row ++) {
			
			int max = matrix[row][0];
			
			for(int col = 0 ; col < matrix[row].length;col++) {
				
				if(matrix[row][col]> max) {
					
					max = matrix[row][col];
				}
			}
			System.out.println(max);
		}
		
	}
}
