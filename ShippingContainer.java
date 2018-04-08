import java.util.Arrays;
import java.util.Scanner;

public class ShippingContainer {

	static int toys(int[] w) {
	    // Complete this function
		int noOfContainers=1;
		Arrays.sort(w);
		int delimit = 4;
		int min = w[0];
		for(int i=0;i<w.length;i++) {
			if(min+delimit < w[i]) {
				noOfContainers++;
				min = w[i];
			}
		}
		return noOfContainers;
		
	}
	
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int[] w = new int[n];
	    for(int w_i = 0; w_i < n; w_i++){
	        w[w_i] = in.nextInt();
	    }
	    int result = toys(w);
	    System.out.println(result);
	    in.close();
	}
	
}