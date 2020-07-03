package array_left_recursion;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) 
    {
    	int rotationCount=0, temp=0;
    	
    	while(rotationCount < d)
    	{
    		for(int i=0; i<a.length; i++)
    		{
    			if(i==0)
    			{
    				temp=a[i];
    				//System.out.println(temp);
    			}
    			
    			else 
    			{
    				a[i-1]=a[i];
    			}
    		}
    		a[a.length-1]=temp;
    
    		rotationCount = rotationCount+1;
    	}
    	
    	return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
    	int a[]= {1,2,3,4,5};
    	System.out.println(Solution.rotLeft(a, 4));
    }
}
