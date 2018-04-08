import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SALES {

    /*
     * Complete the canModify function below.
     */
    static String canModify(int[] a) {
        /*
         * Write your code here.
         */
        int count = 0;
        String isPossible="YES";
        if(a.length ==1) {
        		return isPossible;
        }
        for(int i=0;i<a.length-1;i++) {
            if(a[i] > a[i+1]) {
                count++;
            }
        }
        if(count > 1) {
            isPossible="NO";
        }
        return isPossible;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scanner.nextLine().trim());
        
        int n1 = 0;
        int[] a = null;
        String[] aItems = null;
        
        for(int i=0;i<n;i++) {
        		n1 = Integer.parseInt(scanner.nextLine().trim());
        		a = new int[n1];
        		aItems = scanner.nextLine().split(" ");
        		   for (int aItr = 0; aItr < n1; aItr++) {
        	            int aItem = Integer.parseInt(aItems[aItr].trim());
        	            a[aItr] = aItem;
        	        }

        	        String result = canModify(a);

        	        System.out.println(result);
        }
        		
     
    }
}