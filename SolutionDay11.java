import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionDay11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=6;
        int y=6;
        int i = 0;
        int j = 0;
        int arr[][] = new int[x][y];
        for(i=0; i < x; i++){
            for(j=0; j < y; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int hourGlassSum=0;
        int max=Integer.MIN_VALUE;
 
        i=0;
        j=0;
        while(i<4) {
        		j=0;
        		while(j<4) {
        			for(int k=i+0; k<i+x-3;k++){
        				for(int l=j+0;l<j+y-3;l++){
        					if(k-i!=1 && (l-j!=0 || l-j!=2)) {
        						hourGlassSum = hourGlassSum+arr[k][l];
        					}
        					else if(k-i==1 && l-j==1) {
        						hourGlassSum = hourGlassSum+arr[k][l];
        					}
        				}
        			}
    				if(max < hourGlassSum) {
    					max = hourGlassSum;
    				}
        			hourGlassSum = 0;
        			j++;
        		}
        		i++;
    }
 	System.out.println(max);
    }
}