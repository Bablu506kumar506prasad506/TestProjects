package TestPackage;

import java.io.File;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandeling {

	public static void main(String[] args) {
		try {
			File file = new File("E://file.txt");
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception is rised");
			e.printStackTrace();
		}

	}

}

class Unchecked_Demo {

	public static void main(String args[]) {
		try {
			int num[] = { 0, 1, 2, 3 };
			System.out.println(num[4]);
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Array Index Out Of Bound exception ia rised");
		}

	}
}

class ExcepTest {

	public static void main(String args[]) {
		try {
			int a[] = new int[2];
			System.out.println("Access element three :" + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown  :" + e);
		}
		System.out.println("Out of the block");
	}
}

// How to use finally keyword in exception handling
class ExcepTest2 {

	public static void main(String args[]) {
		int a[] = new int[2];
		try {
			System.out.println("Access element three :" + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown  :" + e);
		} finally {
			a[0] = 6;
			System.out.println("First element value: " + a[0]);
			System.out.println("The finally statement is executed");
		}
	}
}

// code to read data from txt file.
class ReadData_Demo {

	public static void main(String args[]) {
		FileReader fr = null;
		try {
			File file = new File("C:\\Selenium_Files\\file.txt");
			fr = new FileReader(file);
			char[] a = new char[500];
			fr.read(a); // reads the content to the array
			for (char c : a)
				System.out.print(c); // prints the characters one by one
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
