package TestPackage;

public class TernaryOperator {

	public static void main(String[] args) {

		int a = 10, b = 9, c = 8, large;
		
//		large = a>b ? (a>c?a:c) : (b>c?b:c);
		
		large = a>b ? (a>10?b+10:c):(b=a);
		
		System.out.println(large);
	}

}
