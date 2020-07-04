package new_year_chaos;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) 
    {
    	
    	int array[] = q.clone();
    	int N=q.length,pass=0,j, temp, counter=0;
    	boolean status = false;
    	
    	//Using Bubble Sort to sort the array//
    	for(pass=0; pass<q.length-1; pass++)
        {
            
            for(j=0; j<N-1; j++)
            {
                if(q[j] > q[j+1])
                {
                    temp = q[j];
                    q[j] = q[j+1];
                    q[j+1] = temp;
                    counter=counter+1;
                }
            }
                    N = N-1;
        }
    	
    	
    	
    	for(int a=0; a<array.length; a++)
    	{
    		for(int b=0; b<q.length; b++)
    		{
    			if(array[a]==q[b])
    			{
    				if((b-a)> 2)
    				{
    					status=true;
    					break;
    				}
    			}
    		}
    		
    		if(status==true)
    		{
    			break;
    		}
    	}
    	
    	
    	if(status==false)
    	{
    		System.out.println(counter);
    	}
    	
    	else if(status==true)
    	{
    		System.out.println("Too chaotic");
    	}
    	
    	
    }

    
    public static void main(String[] args) 
    {
    	int[] q= {1,2,5,3,7,8,6,4};
    	Solution.minimumBribes(q);
    }
}







/*
  int totalBribes = 0;
    
    int expectedFirst = 1;
    int expectedSecond = 2;
    int expectedThird = 3;
    
    for (int i = 0; i < q.length; ++i) {
        if (q[i] == expectedFirst) {
            expectedFirst = expectedSecond;
            expectedSecond = expectedThird;
            ++expectedThird;
        } else if (q[i] == expectedSecond) {
            ++totalBribes;
            expectedSecond = expectedThird;
            ++expectedThird;
        } else if (q[i] == expectedThird) {
            totalBribes += 2;
            ++expectedThird;
        } else {
           System.out.println("Too chaotic");
            return;
        }
 */ 

