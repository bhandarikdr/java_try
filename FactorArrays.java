import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class FactorArrays {

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        int count = 0;
        int lcm = getLcm(a);
        System.out.println(lcm);
        int checkvalue = lcm;
        int hcf = getHcf(b);
        for(int i=0;checkvalue<=hcf;i++){            
           if(hcf%checkvalue ==0)
                count++;
            System.out.println(checkvalue);
            checkvalue = lcm * (i+2);
        }
        return count;            
    }
    
    static int getLcm(int array[]){
        int lcm = array[0];
        for(int i=1;i<array.length;i++){
            lcm = ((array[i]*lcm)/(gcd(array[i],lcm)));
        }		
		return lcm;
	}

    static int getHcf(int array[]){
        int hcf = array[0];
        for(int i=1;i<array.length;i++){
            hcf = gcd(array[i],hcf);
        }       
        return hcf;
    }

    static int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b,a%b);
    }

   public static void main(String[] args) {
        int[] a = {2,4};

        
        int[] b = {16,32,96};
        

        int total = getTotalX(a, b);

        System.out.println(total);
    }
}
