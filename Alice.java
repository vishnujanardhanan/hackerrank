
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Alice {

    /*
     * Complete the climbingLeaderboard function below.
     */
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        /*
         * Write your code here.
         */
        //Arrays.sort(scores);
        
        //HashSet set = new HashSet<>(Arrays.asList(scores));
        Object[] unique = removeDuplicates(scores);
        Arrays.sort(unique);
        int k=0;
        int j=unique.length-1;
        int [] alicerank = new int[alice.length];
        for(int i=0;i<alice.length;i++) {
        	j=unique.length-1;
        	k=0;
        		while(j>=0 && alice[i] < (int)unique[j]) {
        			j--;
        			k++;
    				
        		}
        		alicerank[i] = k+1;
        }
        return alicerank;
    }

    private static Object[] removeDuplicates(int[] scores) {
    		HashSet set = new HashSet();
    		for(int i=0;i<scores.length;i++) {
    			set.add(new Integer(scores[i]));
    		}
    		return set.toArray();
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = Integer.parseInt(scanner.nextLine().trim());

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");

        for (int scoresItr = 0; scoresItr < scoresCount; scoresItr++) {
            int scoresItem = Integer.parseInt(scoresItems[scoresItr].trim());
            scores[scoresItr] = scoresItem;
        }

        int aliceCount = Integer.parseInt(scanner.nextLine().trim());

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");

        for (int aliceItr = 0; aliceItr < aliceCount; aliceItr++) {
            int aliceItem = Integer.parseInt(aliceItems[aliceItr].trim());
            alice[aliceItr] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

 /*       for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();*/
    }
}