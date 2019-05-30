package TestPackage;

//---------------Abstract Body--------------//
abstract class testjava {
	public abstract void java();
}

// --------------Implementation of abstract body---------//
class testingjavacalss extends testjava {

	// @Override
	public void java() {
		System.out.println("..Welcome test java code..");
		int b = 10;
		double a, c = 20.5;
		a = (b + c);
		System.out.println(a + " test");

	}

}

// ------------------Calling to abstract class---------//
public class TestOOPSConcepts {

	public static void main(String[] args) {

		testjava obj = new testingjavacalss();
		obj.java();

	}

}

// -----------------check 2nd abstract class-------------------//
abstract class bank {
	abstract double RateOfIntrest();
}

class SBI extends bank {

	// @Override
	double RateOfIntrest() {
		return 7;
	}

}

class PNB extends bank {

	double RateOfIntrest() {
		return 8.50;
	}
}

class MainBank {
	public static void main(String args[]) {
		bank b;

		b = new SBI();
		System.out.println("Rate of Interest is: " + b.RateOfIntrest() + " %");

		b = new PNB();
		System.out.println("Rate of Interest is: " + b.RateOfIntrest() + " %");
	}

}

// example of abstract class that have method body
abstract class Bike {
	Bike() {
		System.out.println("bike is created");
	}

	abstract void run();

	void changeGear() {
		System.out.println("gear changed");
	}
}

class Honda extends Bike {
	void run() {
		System.out.println("running safely..");
	}
}

class TestAbstraction2 {
	public static void main(String args[]) {
		Bike obj = new Honda();
		obj.run();
		obj.changeGear();
	}
}

// Another example of abstract class
interface testA {
	void a();

	void b();

	void c();

	void d();
}

abstract class B implements testA {
	public void c() {
		System.out.println("I am c");
	}
}

class M extends B {
	public void a() {
		System.out.println("I am a");
	}

	public void b() {
		System.out.println("I am b");
	}

	public void d() {
		System.out.println("I am d");
	}
}

class Test5 {
	public static void main(String args[]) {
		testA a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}
