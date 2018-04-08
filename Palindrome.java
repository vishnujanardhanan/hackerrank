import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Palindrome {


    /*
     * Complete the highestValuePalindrome function below.
     */
    static String highestValuePalindrome(String s, int n, int k) {
        /*
         * Write your code here.
         */
    		int i=0;
    		int j=0;
    		int change=0;
    		String returnValue="-1";
    		StringBuilder sb = null;
    		if(k==0) {
    			char s10[] = s.toCharArray();
    			for(i=0;i<s10.length-1;i++) {
    				if(Integer.parseInt(String.valueOf(s10[i])) != Integer.parseInt(String.valueOf(s10[i+1]))) {
    					return returnValue;
    				}
    			}
    			returnValue = s;
    		}
    			
    		else if(n==k) {
    			sb = new StringBuilder(n);
    			while(i<n) {
    				sb.append("9");
    				i++;
    			}
    			returnValue = sb.toString();
    		}
    		else if(n%2 > 0) {

    			int length = s.length();
    			char []s4 = s.toCharArray();
    			char []s1 = s.substring(0, n/2).toCharArray();
    			char []s2 = s.substring(n/2+1, s.length()).toCharArray();
    			
			char s3[] = new char[n/2];
			j=0;
			for(i=n/2-1;i>=0;i--) {
				s3[j] = s2[i];
				j++;
			}
    			
    			for(i=0;i<s1.length;i++) {
    					if(s1[i] != s3[i]) {
    						change++;
    					}
    					
    			}
    			
    			if(change==0) {
    				s4[n/2]='9';
    			}
    			
    			sb = new StringBuilder(n);
    				for(i=0;i<n;i++) {
    					sb.append(s4[i]);
    				}
    				returnValue = sb.toString();	
    			return returnValue;
    		}
    		else if (n!=k) {
    			int length = s.length();
    			char []s1 = s.substring(0, n/2).toCharArray();
    			char []s2 = s.substring(n/2, s.length()).toCharArray();
    			
			char s3[] = new char[n/2];
			j=0;
			for(i=n/2-1;i>=0;i--) {
				s3[j] = s2[i];
				j++;
			}
    			
    			for(i=0;i<s1.length;i++) {
    					if(s1[i] != s3[i]) {
    						change++;
    					}
    					
    			}
    			
    			if(change > k) {
    				return returnValue;
    			}
    			else {
    				int [] pal = new int[k];
    				s3 = new char[n/2];
    				j=0;
    				for(i=n/2-1;i>=0;i--) {
    					s3[j] = s2[i];
    					j++;
    				}
    				//3943
    				//3934
    				i=0;
    				change=0;
    				
    				int s1i = 0;
    				int s3i = 0;
    				while(i<n/2 && change<k) {
    					s1i = Integer.parseInt(String.valueOf(s1[i]));
    					s3i = Integer.parseInt(String.valueOf(s3[i]));
    					if(s1i > s3i) {
    						s3[i] = s1[i];
    						change++;
    					}
    					else if(s1i < s3i){
    						s1[i] = s3[i];
    						change++;
    					}
    					i++;
    				}
    				System.out.println(change);
    				
    				i=0;
    				while(i<n/2 && change<k) {
    					s1i = Integer.parseInt(String.valueOf(s1[i]));
    					s3i = Integer.parseInt(String.valueOf(s3[i]));
    					if(s1i < 9 ) {
    						s1[i] = '9';
    						s3[i] = '9';
    						change=change+2;
    					}
    					i++;
    				}
    				
    				
    				sb = new StringBuilder(n);
    				for(i=0;i<n/2;i++) {
    					sb.append(s1[i]);
    				}
    				for(i=n/2-1;i>=0;i--) {
    					sb.append(s3[i]);
    					
    				}
    				returnValue = sb.toString();	
    			}
    			
    		}
    		
    		return returnValue;

    }


    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    		Scanner scan = new Scanner(System.in);
        String[] nk = scan.nextLine().split(" ");

        int n = Integer.parseInt(nk[0].trim());

        int k = Integer.parseInt(nk[1].trim());

        String s = scan.nextLine();

        String result = highestValuePalindrome(s, n, k);

        System.out.println(result);
    }
}