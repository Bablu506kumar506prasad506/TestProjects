package TestPackage;

import org.testng.annotations.Test;

public class TestFib {
	
	@Test
	public void test() {
		// TODO Auto-generated method stub
		
		int n1=0,n2=1,n3,count=10;
		
		System.out.println(n1 +" "+n2);
		for (int i = 0; i < count; i++) {
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
		}
	}

}
