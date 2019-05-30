package TestPackage;

import java.util.Scanner;

//-------Febonacci series-------//
public class TestTypeOfOopsConcepts {

	public static void main(String[] args) {

		int a = 0, b = 1, c, num = 10;

		System.out.print(a + " " + b);
		for (int i = 2; i <= num; i++) {
			c = a + b;

			System.out.print(" " + c);

			a = b;
			b = c;
		}

	}

}

class test2 {
	public static void main(String[] args) {
		int num = 10;
		int[] count = new int[num];
		count[0] = 0;
		count[1] = 1;
		for (int i = 2; i < num; i++) {

			count[i] = count[i - 1] + count[i - 2];
		}
		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i] + " ");
		}
	}
}

// -----------Prime Number ----------//
class primeTest {
	public static void main(String[] args) {
		int i, num = 7, a, b = 0;

		a = num / 2;
		for (i = 2; i < a; i++) {
			if (num % i == 0) {
				System.out.println("This is not a prime number");
				b = 1;
				break;
			}
		}
		if (b == 0) {
			System.out.println("Is a Prime Number:");
		}
	}
}

class primetest2 {
	public static void main(String args[]) {
		int num;
		boolean IsPrime = true;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers ");

		int count = sc.nextInt();
		for (int i = 2; i <= count / 2; i++) {
			num = count % i;
			if (num == 0) {
				IsPrime = false;
				break;
			}
		}
		if (IsPrime) {
			System.out.println(" " + "Given number is prime number");

		} else {
			System.out.println(" " + "Given number is not a prime number");

		}

		EnumInJava Level = EnumInJava.HIGH;
		System.out.println("1 " + Level);

		// if( Level == EnumInJava.HIGH) {
		//
		// } else if( Level == EnumInJava.MEDIUM) {
		//
		// } else if( Level == EnumInJava.LOW) {
		//
		// }

//		for (EnumInJava level : EnumInJava.values()) {
//			System.out.println(level);
//		}
		
		System.out.println(Level);
	}
	
}

enum EnumInJava {
	// HIGH, MEDIUM, LOW;

	 HIGH(3), // calls constructor with value 3
	MEDIUM(2), // calls constructor with value 2
	LOW(1) // calls constructor with value 1
	; // semicolon needed when fields / methods follow

	private final int levelCode;

	private EnumInJava(int levelCode) {
	        this.levelCode = levelCode;
	    }

}
