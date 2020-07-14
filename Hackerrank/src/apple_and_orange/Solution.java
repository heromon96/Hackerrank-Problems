package apple_and_orange;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) 
    {
    	int applesCount=0, orangesCount=0;
    	
    	for(int i: apples)
    	{
    		if((i+a)>=s && (i+a)<=t)
    		{
    			applesCount = applesCount+1;
    		}
    	}
    	
    	for(int j: oranges)
    	{
    		if((j+b)<=t && (j+b)>=s)
    		{
    			orangesCount = orangesCount+1;
    		}
    	}
    	System.out.println(applesCount);
    	System.out.println(orangesCount);
    }

   

    public static void main(String[] args) 
    {
    	int apples[]= {-2,2,1};
    	int oranges[] = {5,-6};
        Solution.countApplesAndOranges(7, 11, 5, 15, apples, oranges);
    }
}

