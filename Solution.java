import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class Solution {

    static int countingValleys(int n, String s) {
        // Complete this function
    		int valley = 0;
    		Stack valleyStackU = new Stack();
    		Stack valleyStackD = new Stack();
    		char[] valleyChar = s.toCharArray();
    		List u = new ArrayList();
    		u.add("U");
    		List d = new ArrayList();
    		u.add("D");
    	   		
    		valleyStackU.addAll(Arrays.asList(valleyChar));
    		valleyStackU.removeAll(d);
    		valleyStackD.addAll(Arrays.asList(valleyChar));
    		valleyStackD.removeAll(u);
    		System.out.println("valleyStackU-----"+valleyStackU);
    		System.out.println("valleyStackD-----"+valleyStackD.toString());
    		
    		/*IntStream.range(0,n).forEach(
    			nbr->{	
    				if(valleyChar[nbr]=='U') {
    					valleyStackU.pop();
    				}
    				else if(valleyChar[nbr]=='D') {
    					valleyStackD.pop();
    				}
    	    		System.out.println("valleyStackU-----"+valleyStackU);
    	    		System.out.println("valleyStackD-----"+valleyStackD);
    				if(valleyStackU.empty() && valleyStackD.isEmpty()) {
    					valley = valley+1;
    				}
    			}
    			
    		);*/
    		
    		for(int nbr=0;nbr<n;nbr++) {
    			if(valleyChar[nbr]=='U' ) {
					valleyStackU.pop();
				}
				else if(valleyChar[nbr]=='D') {
					valleyStackD.pop();
				}
	    		System.out.println("valleyStackU-----"+valleyStackU.toString());
	    		System.out.println("valleyStackD-----"+valleyStackD.toString());
				if(valleyStackU.empty() && valleyStackD.isEmpty()) {
					valley = valley+1;
				}
    		}

    		return valley;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
