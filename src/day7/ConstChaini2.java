package day7 ;

public class ConstChaini2 extends ConstChainig{
	
	ConstChaini2(int x){
		
		System.out.println("Thisis the default Constructor");
	}
	
	ConstChaini2(){
		
		super();
	}
	
	public static void main(String[] args) {
		
		ConstChaini2 o = new ConstChaini2(67);
		ConstChaini2 o1 = new ConstChaini2();
	}
}