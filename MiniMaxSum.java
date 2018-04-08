import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MiniMaxSum {

    /*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(int[] arr) {
        /*
         * Write your code here.
         */
        long sum = 0;
        
        int k=1;
        long [] sumArray = new long [arr.length];
        for(int i=0;i<arr.length;i++){
        		sum=0;
            for(int j=0;j<arr.length;j++) {
            		if(i!=j) {
            			sum  += arr[j];
            		}
            }
            sumArray[i]=sum;
        }
        Arrays.sort(sumArray);
        System.out.println(sumArray[0]+" "+sumArray[sumArray.length-1]);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }
        
        miniMaxSum(arr);
    }
}
