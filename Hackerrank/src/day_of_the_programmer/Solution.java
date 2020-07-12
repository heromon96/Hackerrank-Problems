package day_of_the_programmer;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) 
    {
    	String finalDate=null;
    	int date=243;
    	
    	if(year==1918)
    	{
    		finalDate="26";
    	}
    	
    	else if(year < 1918)	//In Julian Calender//
    	{
    		if(year%4==0)	//Leap Year//
    		{
    			date=date+1;
    			
    			int difference = 256-date;
    			date=difference;
    			finalDate=String.valueOf(date);
    		}
    		
    		else if(year%4!=0) 	//NON - Leap Year//
    		{
    			int difference = 256-date;
    			date=difference;
    			finalDate=String.valueOf(date);
    		}
    	}
    	
    	else if(year >= 1919) //In Gregorian Calender//
    	{
    		if(year%400==0 || year%4==0 && year%100!=0)	//Leap Year//
    		{
    			date=date+1;
    			
    			int difference = 256-date;
    			date=difference;
    			finalDate=String.valueOf(date);
    		}
    		
    		else 	//NON - Leap Year//
    		{
    			int difference = 256-date;
    			date=difference;
    			finalDate=String.valueOf(date);
    		}
    	}
    	
    	finalDate=finalDate.concat(".09."+year);
    	
    	return finalDate;
    }

    public static void main(String[] args) throws IOException 
    {
    	System.out.println(Solution.dayOfProgrammer(2017));
    }
}

