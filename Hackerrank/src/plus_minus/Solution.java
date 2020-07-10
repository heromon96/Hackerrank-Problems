package plus_minus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import javax.print.attribute.standard.Finishings;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) 
    {
    	int positive=0, negative=0, zeroes=0;
    	List<String> list = new ArrayList<>();
    	for(int a: arr)
    	{
    		if(a>0)
    		{
    			positive = positive+1;
    		}
    		
    		if(a<0)
    		{
    			negative = negative+1;
    		}
    		
    		else if(a==0)
    		{
    			zeroes = zeroes+1;
    		}
    	}
    	
    	double answer = (double)positive/arr.length;
    	list.add(findResult(answer));
    	
    	answer = (double)negative/arr.length;
    	list.add(findResult(answer));
    	
    	answer = (double)zeroes/arr.length;
    	list.add(findResult(answer));
    	
    	
    	for(String d: list)
    	{
    		System.out.println(d);
    	}
    }
    
    
    public static String findResult(double answer)
    {
    	String s = String.valueOf(answer);
    	if(s.length()<8)
    	{
    		while(true)
    		{
    			s=s.concat("0");
    			
    			if(s.length()==8)
    			{
    				break;
    			}
    		}
    	}
    	
    	else if(s.length()>6)
    	{
    		s=s.substring(0, 6);
    	}
    	
    	return s;
    }

    public static void main(String[] args) 
    {
    	int arr[] = {1,1,0,-1,-1};
    	Solution.plusMinus(arr);
    }
}

