import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {        
        String[] items = s.split(":");
        String hour = items[0];
        String min = items[1];
        String sec = items[2].substring(0,2);
        String ampm = items[2].substring(2,4);
        int hr = Integer.parseInt(hour);
        if (ampm.equals("PM") && hr != 12){
            hr = hr + 12;
            hour = Integer.toString(hr);
        }
        if (ampm.equals("AM") && hr == 12){
            hour = "00";
        }
        System.out.println(hour+" "+min+" "+sec+" "+ampm);
        return hour+":"+min+":"+sec;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

       // bw.write(result);
       // bw.newLine();

       // bw.close();
    }
}
