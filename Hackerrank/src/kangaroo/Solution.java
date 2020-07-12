package kangaroo;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) 
    {
    	String answer = null;
    	int firstDistance=x1, secondDistance=x2;
    	
    	while(firstDistance < secondDistance)
    	{
    		firstDistance = firstDistance+v1;
    		secondDistance = secondDistance+v2;
    		
    		if(firstDistance == secondDistance)
    		{
    			answer="YES";
    		}
    		
    		else
    		{
    			answer="NO";
    		}
    	}
    	
    	return answer;
    }

    public static void main(String[] args) throws IOException 
    {
    	System.out.println(Solution.kangaroo(21,6,47,3));
    }
}

