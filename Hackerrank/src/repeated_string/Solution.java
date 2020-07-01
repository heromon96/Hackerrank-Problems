package repeated_string;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	String s1 = s;
    	int counter=0;
    	
    	while(true)
    	{

    		if(s1.length()<=n)
    		{
        		s1=s1.concat(s);    			
    		}
    		
    		else if(s1.length()>n)
    		{
    			int index = (int) n;
    			s1 = s1.substring(0, index);
    			break;
    		}
    		//System.out.println("Length = " +s1.length());
    	}
    	
    	char array[] = s1.toCharArray();
    	
    	for(char c: array)
    	{
    		if(c=='a')
    		{
    			counter = counter+1;
    		}
    	}
    	
    	return counter;
    }
    
    public static void main(String[] args)
    {
        System.out.println(Solution.repeatedString("aba", 10));
    }
}
