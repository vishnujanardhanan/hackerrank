import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LargestPermutation {

    static int[] largestPermutation(int k, int[] arr) {
        // Complete this function
    		int [] arr1 = Arrays.copyOf(arr, arr.length);
    		Arrays.sort(arr1);

    		int i=0;
    		int temp;
    		int index = 0;
    		int element = 0;
    		int swap=0;
    		while(swap<k && i<arr.length) {
    			element=arr1[arr1.length-1-i];
    			if(arr[i]!=element) {
	    			temp = arr[i];
	    			index = findIndex(arr,element);
	    			arr[i] = arr[index];
	    			arr[index] = temp;
	    			swap++;
	    			//System.out.println(arr[0]+" "+i);
    			}
    			
    			i++;
    			
    		}
    		
    		return arr;
    }
    
    static int findIndex(int [] arr,int value) {
    	int i=0;
    		for(i=0;i<arr.length;i++) {
    			if(arr[i]==value) {
    				break;
    			}
    		}
    		return i;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = largestPermutation(k, arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}