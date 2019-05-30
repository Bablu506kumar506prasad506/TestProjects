package TestPackage;

public class AbstractClass3 {

	public static void main(String[] args) {
		
		A  obj = new testsa();
		obj.a();
		obj.b();
		obj.c();
		obj.d();

	}

}

interface A{
	void a();
	void b();
	void c();
	void d();
}

abstract class test1 implements A{
	public void c(){
		System.out.println("Test c");
	}
}
class testsa extends test1{
	public void a(){
		System.out.println("Test a");
	}
	public void b(){
		System.out.println("Test b");
	}
	public void d(){
		System.out.println("Test d");
	}
}