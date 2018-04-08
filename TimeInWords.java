import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TimeInWords {
	
    static String timeInWords(int h, int m) {
        // Complete this function
    		String time = "";
    		Map timeMap = new HashMap();
    		timeMap = populateMap(timeMap);
    		
    		if(m==00 || m==15 || m==30 || m==45) {
	    		switch (m) {
	    		
		    		case 00:
		    			time = timeMap.get(h)+" "+"o' clock";
		    			break;
		    		case 15:
		    			time = "quarter past "+timeMap.get(h);
		    			break;
		    		case 30:
		    			time = "half past "+timeMap.get(h);
		    			break;
		    		case 45:
		    			time = "quarter to "+timeMap.get(h+1);
		    			break;
		    			
	    		}
    		}
    		
    		else if(m<10) {
    			time = timeMap.get(m)+" minute past "+ timeMap.get(h);
    		}
    		else if (m<30) {
    			time = timeMap.get(m)+" minutes past "+ timeMap.get(h);
    		}
    		else if (m>30) {
    			time = timeMap.get(60-m)+" minutes to "+ timeMap.get(h+1);
    		}

    		
    		return time;
    }
    
    static Map populateMap(Map timemap) {
	    	timemap.put(1,"one");timemap.put(2,"two");timemap.put(3,"three");
	    	timemap.put(4,"four");timemap.put(5,"five");timemap.put(6,"six");
	    	timemap.put(7,"seven");timemap.put(8,"eight");timemap.put(9,"nine");
	    	timemap.put(10,"ten");timemap.put(11,"eleven");timemap.put(12,"twelve");
	    	timemap.put(13,"thirteen");timemap.put(14,"fourteen");timemap.put(15,"fifteen");
	    	timemap.put(16,"sixteen");timemap.put(17,"seventeen");timemap.put(18,"eighteen");
	    	timemap.put(19,"nineteen");timemap.put(20,"twenty");timemap.put(21,"twenty one");
	    	timemap.put(21,"twenty two");timemap.put(23,"twenty three");timemap.put(24,"twenty four");
	    	timemap.put(25,"twenty five");timemap.put(26,"twenty six");timemap.put(27,"twenty seven");
	    	timemap.put(28,"twenty eight");timemap.put(29,"twenty nine");timemap.put(30,"thirty");
	    	return timemap;
    }
    
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        String result = timeInWords(h, m);
        System.out.println(result);
        in.close();
    }

}
