import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FlippingBits {

    static long flippingBits(long N) {
        // Complete this function
        String binary = Long.toBinaryString(N);
        long n1 = Integer.parseInt(binary,10);
        n1=~n1;
        return n1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            long N = in.nextLong();
            long result = flippingBits(N);
            System.out.println(result);
        }
        in.close();
    }
}
