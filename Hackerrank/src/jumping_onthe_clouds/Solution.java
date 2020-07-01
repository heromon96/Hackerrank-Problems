package jumping_onthe_clouds;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
    	int counter=0, keeptrackof_consecutive_zeroes=0;
    	
    	for(int i=0; i<c.length; i++)
    	{
    		if(c[i]==0 && c[i+1]==0 && c[i+2]==0)
    		{
    			keeptrackof_consecutive_zeroes=keeptrackof_consecutive_zeroes+1;
    		}
    		
    		else if(c[i]==0)
    		{
    			counter = counter+1;
    		}
    	
    	}
    	
    	if(keeptrackof_consecutive_zeroes>0)
    	{
    		return (counter-keeptrackof_consecutive_zeroes);
    	}
    	
    	else
    	{
    		return (counter-1);
    	}
    	
    }
    
    public static void main(String[] has)
    {
    	int c[] = {0,0,0,1,0,0};
    	System.out.println(Solution.jumpingOnClouds(c));
    }
}

