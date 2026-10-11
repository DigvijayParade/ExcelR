package day5;

public class MethDiff {

	public static void main(String[] args) {
		
		String s = "nanu";
		String y = "nanu";
		String x = new String("nanu");
		
		System.out.println(s.hashCode());
		System.out.println(y.hashCode());
		System.out.println(x.hashCode());
		System.out.println("////////////////SCP in work");
		System.out.println(s == y);
		System.out.println(s.equals(y));
		
		System.out.println(x == y);
		System.out.println(x.equals(s));
	}
}
