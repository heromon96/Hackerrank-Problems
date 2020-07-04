package two_strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
    	
    	String answer="NO";
    	char array1[];
    	
    	if(s1.length()>=26)
    	{
    		s1=s1.substring(0, 26);
    		array1 = s1.toCharArray();
    	}
    	
    	else 
    	{
    		array1 = s1.toCharArray();
    	}
    	
    	
    	for(char c1: array1)
    	{
    			if(s2.contains(String.valueOf(c1)))
    			{
    				answer="YES";
    				break;
    			}
    	}
    	
    	return answer;
    }

    public static void main(String[] args) 
    {
    	System.out.println(Solution.twoStrings("hello", "world"));
    }
}

