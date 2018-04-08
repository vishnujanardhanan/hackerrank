import java.util.Scanner;

public class Power {
	
	int power(int n, int p) throws Exception{
		if(n<0 || p<0) {
			throw new Exception("n and p should be non-negative");
		}
		int pow = (int)Math.pow((double)n, (double)p);
		return pow;
	}
	
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Power myCalculator = new Power();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
