package string_construction;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the stringConstruction function below.
    static int stringConstruction(String s) 
    {
//    	long totalCost=0L;
//    	String p=null;
//    	List<Character> list = new ArrayList<>();
//    	int length = s.length()-1;
//    	
//    	for(int i=0; i<length; i++)
//    	{
//    		char c = s.charAt(i);	
//    		for(int j=i+1; j<length; j++)
//    		{
//    			p = s.substring(j, s.length());
//    			
//    			if(p.contains(String.valueOf(c)))
//    			{
//    				list.add(c);
//    				//System.out.println("List Size = " +list.size()+ " for Character = " +c);
//    				break;
//    			}
//    			
//    			else
//    			{
//    				break;
//    			}
//    			
//    		}
//    	}
//    	totalCost = s.length();
//    	totalCost = totalCost-list.size();
//    	
//    	return (int)totalCost;
    	
    	
    	long total = s.chars().distinct().count();
        return (int) total;
    }


    public static void main(String[] args) throws IOException 
    {
    	System.out.println(Solution.stringConstruction("abcdabc"));
    }
}

