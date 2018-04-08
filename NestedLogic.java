import java.util.Scanner;

public class NestedLogic {

	public static void main(String a[]) {
		Scanner s = new Scanner(System.in);
		int i=0;
		int []date=new int[6];
		
		while(i<6) {
			date[i] = s.nextInt();
			i++;
		}
		
		int y = date[2] - date[5];
		int m = date[1] - date[4];
		int d = date[0] - date[3];
		int fine=0;
		
		if(y < 0) {
			fine = 0;
		}
		else if(y > 0) {
			fine = 10000;
		}
		else if(m<0) {
			fine = 0;
		}
		else if(m>0) {
			fine = 500*m;
		}
		else if(d<0) {
			fine=0;
		}
		else if(d>0) {
			fine = 15*d;
		}
		
		System.out.println(fine);
	}
	
}
