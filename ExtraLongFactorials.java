import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {



	static void extraLongFactorials(int n) {
	    // Complete this function
		BigInteger factorial = BigInteger.ONE;
		for(int i=n;i>1;i--) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		System.out.println(factorial);
	}

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    extraLongFactorials(n);
	    in.close();
	}
}