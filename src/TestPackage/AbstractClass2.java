package TestPackage;

import org.testng.annotations.Test;

public abstract class AbstractClass2 {
	@Test(priority=0)
		public abstract void method();
	@Test(priority=1)
	abstract void drow();
}

class tests extends AbstractClass2{
	
	public void method(){
		System.out.println("Abstarct method use");
	}
	
	public static void main(String args[]) {
		AbstractClass2 abs = new tests();
		abs.method();
	}

	@Override
	void drow() {
		// TODO Auto-generated method stub
		
	}
}


//abstract class shape{
//	@Test(priority=0)
//	abstract void drow();
//}
class rectangle extends AbstractClass2{

	@Override
	void drow() {
		System.out.println("Rectangle shape should be come");
		
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	
}

class Circle extends AbstractClass2{

	@Override
	void drow() {
		System.out.println("Circle shape should be come");
		
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	
}
class Head1{
	public static void main(String args[]) {
		AbstractClass2 sh = new rectangle();
		AbstractClass2 sh1 = new Circle();
		
			sh.drow();
			sh1.drow();
	}
}
