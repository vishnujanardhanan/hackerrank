import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionDay9{

    static int factorial(int n) {
        // Complete this function
    		int result =	 factorial(1,n);
    		return result;
    }
    
    static int factorial(int factorial, int n) {
    		
    		if(n>1) {
    			factorial *= n;
    			return factorial(factorial,n-1);
    		}
    		return factorial;
    }
    
    

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int result = factorial(n);
    System.out.println(result);
    }
}