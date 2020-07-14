package climbing_the_leaderboard;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	static int counter=0;
	static List<Integer> list = new ArrayList<>();
	static List<Integer> leaderboard = new ArrayList<>();
	static boolean status = false;
    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) 
    {
    	int size = alice.length, index=0;
    	int array[] = new int[size];
    	
    	Solution.findLeaderboard(scores);
    	
    	
    	index = list.size();
    	System.out.println(list);
    	
    	return array;
    }
    
    
    
    public static void findLeaderboard(int[] arr)
    {
    	for(int i=0; i<arr.length; i++)
    	{
    		if(i==0 && arr[i] != arr[i+1])
    		{
    			counter = counter+1;
				list.add(counter);
    		}
    		
    		else if(i < (arr.length-1))
    		{
    			if(arr[i] == arr[i+1])
    			{
    				counter = counter+1;
    				list.add(counter);
    			}
    			
    			else if(arr[i] == arr[i-1])
    			{
    				list.add(counter);
    			}
    			
    			else if(arr[i] != arr[i+1])
    			{
    				counter = counter+1;
    				list.add(counter);
    				if(i == (arr.length-2))
    				{
    					status = true;
    				}
    			}
    		}
    		
    		else if(i == (arr.length-1))
    		{
    			if(status==true)
    			{
    				counter=counter+1;
    				list.add(counter);
    			}
    		}
    	}
    }
    
    

    
    public static void main(String[] args) throws IOException 
    {
        int scores[] = {100,100,50,40,40,20,10};
        int alice[] = {5,25,50,120};
        Solution.climbingLeaderboard(scores, alice);
    }
}
