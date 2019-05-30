package TestPackage;

// parent class
class TestAnimal{
	public void move(){
		System.out.println("Animal can move...");
	}
}
// Child class
class TestDog extends TestAnimal{
	
	//Overriding method
	public void move() {
		System.out.println("Doge can run and move...");
	}
	
	public void testrun() {
		System.out.println("test run test..");
		int a=10, b=20,c;
		c=a+b;
		System.out.println("Sum: " +c);
	}
}
// Main Class
public class OverRidingClass1 {

	public static void main(String[] args) {
		TestAnimal a = new TestAnimal();
		TestDog b = new TestDog();
		
		a.move();
		b.move();
		b.testrun();
	}

}

//--------------------------------------------------------

//Using the super Keyword
class TestSuperKeyword{
	public void testparent() {
		System.out.println("parent class move to test..");
	}
}
class testchildclass extends TestSuperKeyword{
	public void testparent() {
		super.testparent();
		System.out.println("child class move to test..");
	}
	
}

class MaintestSuper{
	public static void main(String [] args) {
		TestSuperKeyword ts = new testchildclass();
		ts.testparent();
	}
}
