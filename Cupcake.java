
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Cupcake {

    static long marcsCakewalk(int[] calorie) {
        // Complete this function
    		Arrays.sort(calorie);
    		long miles = 0;
    		int i=calorie.length-1;
    		int j=0;
    		while (i>=0) {
    			miles+=calorie[i]*Math.pow(2, j);
    			i--;
    			j++;
    		}
    		return miles;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calorie = new int[n];
        for(int calorie_i = 0; calorie_i < n; calorie_i++){
            calorie[calorie_i] = in.nextInt();
        }
        long result = marcsCakewalk(calorie);
        System.out.println(result);
        in.close();
    }
}