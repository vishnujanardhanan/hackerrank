import java.util.Arrays;
import java.util.Scanner;

public class GridSearch {
	
    static String gridSearch(String[] G, String[] P) {
        // Complete this function
    		String status="NO";
    	
    		if(P.length > G.length) {
    			return status;
    		}
    		int l=0;
    		for(int k=0;k<G.length;k++) {
			if(G[k].contains(P[0])) {
				l=k;
			}
		}
    		
    		int i=0;
    		int j=0;
    		
    		while(i<P.length) {
    			if(G[l].contains(P[i])) {
    				l++;
    				i++;
    				status="YES";
    			}
    			else {
    				status="NO";
    				break;
    			}
    		}
    		
    		return status;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String[] G = new String[R];
            for(int G_i = 0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String[] P = new String[r];
            for(int P_i = 0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            System.out.println(Arrays.toString(G));
            String result = gridSearch(G, P);
            System.out.println(result);
        }
        in.close();
    }

}
