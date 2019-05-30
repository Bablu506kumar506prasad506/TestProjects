package ChangeDateANDTimeFromSystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testDateTime {

	 private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {
	            String value = "2014-12-12 00:26";
	            Date date = dateFormat.parse(value);
	            value = dateFormat.format(date);
	            final Process dateProcess = Runtime.getRuntime().exec("cmd /c date "+value.substring(0, value.lastIndexOf(' ')));
	            dateProcess.waitFor();
	            dateProcess.exitValue();
	            final Process timeProcess = Runtime.getRuntime().exec("cmd /c time "+value.substring(value.lastIndexOf(' ')+1));
	            timeProcess.waitFor();
	            timeProcess.exitValue();
	        } catch (Exception exception) {
	            throw new RuntimeException(exception);
	        }

	}

}
