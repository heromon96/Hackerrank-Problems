package time_conversion;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) 
    {
    	String newTime = null;
    	int time=0;
    	
    	if(s.substring(0, 2).equals("12") && s.subSequence(8, 10).equals("AM"))
    	{
    		newTime="00";
    	}
    	
    	else if(s.substring(0, 2).equals("12") && s.subSequence(8, 10).equals("PM"))
    	{
    		newTime="12";
    	}
    	
    	else if(!s.equals("12") && s.subSequence(8, 10).equals("PM"))
    	{
	    	time = Integer.valueOf(s.substring(0, 2));
	    	time = time+12;
	    	newTime = String.valueOf(time);
    	}
    	
    	else if(!s.equals("12") && s.subSequence(8, 10).equals("AM"))
    	{
    		newTime = s.substring(0, 2);
    	}
    	
    	
    	newTime=newTime.concat(s.substring(2, s.length()-2));
    	
    	return newTime;
    }

    public static void main(String[] args) throws IOException 
    {
       System.out.println(Solution.timeConversion("12:45:54PM"));
    }
}

