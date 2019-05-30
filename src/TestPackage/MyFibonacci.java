package TestPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jxl.demo.Demo;

//Fibonacci Series in Java without using recursion

class FibonacciExample1 {
	public static void main(String args[]) {
		int n1 = 0, n2 = 1, n3, i, count = 4;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i <= count; ++i)// loop starts from 2 because 0 and 1 are
									// already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			System.out.println(" ");
			n1 = n2;
			System.out.println("1st " + n1);
			System.out.println("2nd " + n2);
			n2 = n3;
			System.out.println("3rd " + n2);
			System.out.println("4th " + n3);
		}

	}
}

public class MyFibonacci {

	public static void main(String a[]) {

		int febCount = 15;
		int[] feb = new int[febCount];
		feb[0] = 0;
		feb[1] = 1;
		for (int i = 2; i < febCount; i++) {
			feb[i] = feb[i - 1] + feb[i - 2];
		}
		for (int j = 0; j < febCount; j++) {
			System.out.println(feb[j] + " ");
		}
	}
}

class test {

	public static void main(String[] args) {
		int i, j, count = 10;

		// Post execution
		for (i = 0; i < count; i++) {
			i++;
			System.out.print(i);
		}
		System.out.print("ghfhfhj");
		// Pre execution
		for (j = 0; j < count; ++j) {
			++j;
			System.out.println(j);
		}

		System.out.println("Post Increment");
		int a = 1;
		int b = a++;

		System.out.print("Post a=" + a + " ");
		System.out.print("Post b=" + b + " ");
		b = a;
		System.out.print("Post after b=" + b + " ");

		System.out.println("");
		System.out.println("Pre Increment");
		int c = 1;
		int d = ++c;

		System.out.print("Pre c=" + c + " ");
		System.out.print("Pre d=" + d + " ");
		d = c;
		System.out.print("Pre after d=" + d + " ");

	}

}

/* Fibonacci Series best example */

class Demo1 {
	int fib(int n) {
		if (n == 1)
			return (1);
		else if (n == 2)
			return (1);
		else
			return (fib(n - 1) + fib(n - 2));
	}
}

class runDemo1 {
	public static void main(String[] args) throws Exception, IOException {
		InputStreamReader ISR = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ISR);
		System.out.println("Please enter a number :");
		int number = Integer.parseInt(br.readLine());
		Demo1 obj = new Demo1();
		System.out.println("fibonacci series is as follows");
		int result = 0;
		System.out.println(result);
		for (int i = 1; i <= number; i++) {
			result = obj.fib(i);
			System.out.println(result);
		}
		System.out.println();
		System.out.println(number + "th value of the series is " + result);
	}
}