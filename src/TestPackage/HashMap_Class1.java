package TestPackage;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Class1 {

	public static void main(String[] args) {
		 HashMap<String, Integer> Table = new HashMap<String, Integer>();
		    Table.put("JAN", 1);    
		    Table.put("FEB", 2);    
		    Table.put("MAR", 3);    
		    Table.put("APR", 4);    
		    Table.put("MAY", 5);    
		    Table.put("JUN", 6);    

		    String testdata="MAR";
		    System.out.println("------------------------------------------------");
		    Integer curMon = Table.get(testdata);
		    System.out.println(curMon);
		    //Here output will be 3 which it will fetch from the hashmap table

		    //Now I am adding 1 from the return value which is 3. So 3+1=4 
		    Integer newMonthValue=curMon+1;
	}

}
