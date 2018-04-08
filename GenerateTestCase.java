
	import java.io.*;
	import java.util.*;

	public class GenerateTestCase {
	    
	    int n;
	    int k;
	    int[] times;
	    
	    GenerateTestCase(int n, int k, int[] times) {
	        System.out.println(n+" "+k);
	        for(int i=0;i<times.length;i++) {
	            System.out.print(times[i]);
	        }
	    }

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        System.out.println("5");
	        new GenerateTestCase(4,2, new int []{-1, 0, 1, 4});
	        new GenerateTestCase(5,3, new int []{-2, -1, 1});
	        new GenerateTestCase(6,4, new int []{-5, -3,-1, 0, 1, 4});
	        new GenerateTestCase(7,5, new int []{-1, 0, 0, 1, 2, 4, 6,4});
	        new GenerateTestCase(8,6, new int []{-10, -9, -7, -5, -1, 0, 1, 4});
	    }
	}
