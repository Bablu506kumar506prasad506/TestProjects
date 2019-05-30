package TestPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Without using reveres method we reveres the string */

public class StringInReversOrder2 {
	
	static String test1="";

	public static void main(String[] args) {
		System.out.println("Please enter the string values :");
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				test1 = br.readLine();
				char[] cr = test1.toCharArray();
				for (int i = cr.length-1; i >=0; i--) {
					System.out.print(cr[i]);
				}
			} catch (Exception e) {
				e.getMessage();
			}
	}

}


class revers2{
	public static void main(String [] args) {
		String input1 = "My Name Is Bablu";
		
		char[] temp = input1.toCharArray();
		int left, right=0;
		
		right = temp.length-1;
		for (left = 0; left < right; left++,right--) {
			// Swap values of left and right 
			char temp1 = temp[left];
			temp[left] = temp[right];
			temp[right] = temp1;
		}
		for (char c : temp) {
			System.out.print(c);
		}
		
		String reverse = new String(temp);
		System.out.println(reverse);
	}
}


class reverestest{
	public static void main(String [] args) {
		String name = "My Name Is Bablu";
		char[] temp = name.toCharArray();
		for (int i = temp.length-1; i >=0; i--) {
			System.out.print(temp[i]);
		}
	}
}


/*Method over loading example*/
class MultipleMain{

	  public static void main(String args[]){
	      main(1);
	      main('c');
	      main("MyString");
	  }

	  public static void main(int i){
	     System.out.println("1st Inside Overloaded main()");
	   
	  }

	  public static void main(char i){
	     System.out.println("2nd Inside Overloaded main()");
	  }
	  public static void main(String str){
	     System.out.println("3rd Inside Overloaded main()");
	  }
	}

























