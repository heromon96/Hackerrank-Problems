package breaking_the_records;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) 
    {
    	int array[] = new int[2];
    	int min=scores[0],max=scores[0], minCount=0,maxCount=0;
    	
    	for(int a: scores)
    	{
    		if(a > max)
    		{
    			max=a;
    			maxCount = maxCount+1;
    		}
    		
    		if(a < min)
    		{
    			min=a;
    			minCount = minCount+1;
    		}
    	}
    	
    	array[0]=maxCount;
    	array[1]=minCount;
    	
    	for(int i: array)
    	{
    		System.out.println(i);
    	}
    	
    	return array;
    }

    
    public static void main(String[] args) throws IOException 
    {
    	int scores[] = {10,5,20,20,4,5,2,25,1};
    	Solution.breakingRecords(scores);
    }
}