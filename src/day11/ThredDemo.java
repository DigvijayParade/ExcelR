package day11;

public class ThredDemo extends Thread{
	
	public static void main(String[] args) {
		
		
	}
	@Override
	public void start() {
		
		for(int i = 0 ; i <= 200 ; i++) {
			
			System.out.println(i);
		}
	}

}
