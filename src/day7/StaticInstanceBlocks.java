package day7;

public class StaticInstanceBlocks {

	static{
		
		System.out.println("thisis an static block ");
	}
	
	static {
		
		System.out.println("the logic inside the static block is only executed once whent he class is created");
	}
	
	{
		
		System.out.println("THis is an instance block,it will be executed whenever we will create the object of this class");
	}
	
	{
		System.out.println("There can be multiple static and the instance blocks in one class");
	}
	
	public static void main(String[] args) {
		
		StaticInstanceBlocks o = new StaticInstanceBlocks();
	}
}
