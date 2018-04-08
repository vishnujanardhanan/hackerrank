import java.util.stream.IntStream;

public class SolutionDay10 {

	public static void main(String s[]) {
		int k=65535;
		String binaryString =  Integer.toBinaryString(k);
		System.out.println("binaryString--"+binaryString);
		int max = countMax(binaryString);
		System.out.println("max--"+max);
		
	}
	
	public static int countMax(String binaryString) {
		int max = 0;
		String []array = binaryString.split("0");
		
		for(int i=0;i<array.length;i++) {
			String element = (String)array[i];
			if(max < element.length()) {
			max=element.length();
			}
		}
		return max;
	}
	
/*	public static int  countMax(char[] array, int index, int max, int tempMax) {
		
		
		if(index<array.length) {
			
			if(array[index]=='0') {
				if(max < 1)
					{ 
						max=tempMax;
					}
				else {
					tempMax=0;
				}
			}
			
			 if(array[index]=='1') {
				if(index!=0) {
					if(array[index-1]=='1') {
						tempMax+=1;
					}
				}
				if(index==0) {
					if(array[index]=='1') {
						tempMax+=1;
					}
				}
				
			}
			 if(max<tempMax) {
				 max = tempMax;
			 }
				 
			index+=1;
			
			return countMax(array, index,max,tempMax);
		}
		else if(index==array.length) {
			if(array[index-1]=='1') {
				max=max+1;
			}
		}
		
		return max;
	}*/
	
	
	
}
