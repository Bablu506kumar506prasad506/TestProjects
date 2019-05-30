package TestPackage;

public class Factorial_Number {

	public static void main(String[] args) {
		int fact = 1;
		int number = 5;// It is the number to calculate factorial
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("1st Factorial of :" + number + " is: " + fact);

	}
	
}
class FactorialExample2{  
	 static int factorial(int n){    
	  if (n == 0)    
	    return 1;    
	  else    
	    return(n * factorial(n-1));    
	 }    
	 public static void main(String args[]){  
	  int i,fact=1;  
	  int number=4;//It is the number to calculate factorial    
	  fact = factorial(number);   
	  System.out.println("2nd Factorial of :"+number+" is: "+fact);    
	 }  
	}  