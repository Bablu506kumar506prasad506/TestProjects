package ChangeDateANDTimeFromSystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LocalTimeChangeTest {

    private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public static void main(String[] args) {
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

/*public class Exec {

    public static void main(String[] args) {
        try {
            String[] cmd = {"/bin/bash","-c","echo yourPassword | sudo -S date --set='2017-05-13 21:59:10'"};
            Runtime.getRuntime().exec(cmd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}*/


