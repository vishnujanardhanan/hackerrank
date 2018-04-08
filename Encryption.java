import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Encryption {
    static String encryption(String s) {
        // Complete this function
    		StringBuilder aBuilder = new StringBuilder(s.length());
    		s=s.replaceAll(" ", "");
    		int length = s.length();

    		int rows = (int)Math.floor(Math.sqrt((double)length));
    		int columns=0;
    		if(Math.sqrt((double)length)==Math.floor(Math.sqrt((double)length))) {
    			columns=rows;
    		}
    		else {
    		 columns = rows+1;
    		}
    		if(rows*columns < length) {
    			rows=rows+1;
    		}
    		List <String>stringSplitList = new ArrayList<String>();
    		int i=0;
    		while(i<s.length()) {
    			if(i+columns < s.length()) {
    				stringSplitList.add(s.substring(i, i+columns));
    			}
    			else {
    				stringSplitList.add(s.substring(i, s.length()));
    				break;
    			}
    			i=i+columns;
    		}
    		String [][] encryptArray = new String[columns][columns];
    		String temp="";
    		int j=0;
    		int k=0;
    		char[] charArray = new char[columns];
    		
    		String s1 = null;

    			for(j=0;j<rows;j++) {
        			temp = stringSplitList.get(j);
        			charArray = temp.toCharArray();
    				for(k=0;k<columns;k++) {
    					if(k<charArray.length) {
    						
    						s1 = String.valueOf(charArray[k]);
    						encryptArray[k][j] = s1;
    					}
    					else {
    						break;
    					}
    				}
    			}
    		
    		
    		
    		List encryptList = new ArrayList();
    	String sss="";	
for(i=0;i<columns;i++) {
	sss="";
	for(j=0;j<columns;j++) {
		if(encryptArray[i][j]!=null) {
		sss+=encryptArray[i][j];
		}
	}
	encryptList.add(sss);
}
    	
    		for( i=0;i<encryptList.size();i++) {
    			aBuilder.append(encryptList.get(i)).append(" ");
    		}
    		return aBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String result = encryption(s);
        System.out.println(result);
        in.close();
    }
}
