import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Prime {
	public static void main (String s[]) {
		Scanner sc = new Scanner(System.in);
		List<String> result = new ArrayList<String>();
		int n = sc.nextInt();
		int [] num = new int[n];
		int j=0;
		Map<Integer,Double> sqrtMap = new HashMap<Integer,Double>();
		Map<Integer,String> resultMap = new HashMap<Integer,String>();
		
		while(n > j) {
			num[j] = sc.nextInt();
			j++;
		}
		int i=0;
		for(i=0;i<n;i++) {
			sqrtMap.put(num[i], Math.abs(Math.sqrt(num[i])));
		}
		j=0;
		boolean flag=true;
		while(j<n) {
			flag=true;
			if(num[j]==1) {
				resultMap.put(num[j],"Not prime");
			}
			else {
				for(i=2;i<=sqrtMap.get(num[j]);i++) {
					
					if(num[j]%i == 0) 
					{
						resultMap.put(num[j],"Not prime");
						flag=false;
						break;
					}
				}
				if(flag) {
					resultMap.put(num[j],"Prime");
				}
			}
			j++;
		}
		for(int s1: num) {
			System.out.println(resultMap.get(s1));
		}
	}

}
