package TestPackage;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.openqa.jetty.html.Input;

/* Using string builder and reveres method */
public class StringInReversOrder {
	
	static String s ="BABLU";

	public static void main(String[] args) {
			StringBuilder revers = new StringBuilder();
			revers.append(s);
			revers = revers.reverse();
			
			System.out.println("Check Revers values :" +revers);
	}

}

class ReveresClsaa{
	
	static String input1 = "My Name Is Bablu";
	
	public static void main(String [] args) {
		char[] hello = input1.toCharArray();
		List<Character> trail = new LinkedList<>();
		
		for (char c : hello) {
			trail.add(c);
			Collections.reverse(trail);
			ListIterator li = trail.listIterator();
			
			while (li.hasNext()) {
				System.out.println("Check revers :" +li.next());
			}
			
		}
		
	}
}