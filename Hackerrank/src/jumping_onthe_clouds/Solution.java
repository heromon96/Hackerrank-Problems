package jumping_onthe_clouds;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
    	int counter=0, tracker=0;
    	boolean status = false;
    	
    	
    	for(int i=0; i<c.length; i++)
    	{
    		if(status==true && tracker<=2)
    		{
    			tracker=tracker+1;
    			continue;
    		}
    		
    		
    		
    		else if(i<=(c.length-3) && c[i]==0 && c[i+1]==0 && c[i+2]==0)
    		{
    			counter=counter+1;
    			status=true;
    			tracker = tracker+1;
    			
    			System.out.println("3 Zeroes : Counter's Value = " +counter);
    		}
    		
    		
    		
    		
    		else if(i<=(c.length-2) && c[i]==0 && c[i+1]==0)
    		{
    			counter=counter+1;
    			System.out.println("2 Zeroes : Counter's Value = " +counter);
    		}
    		
    		
    		
    		
    		else if(c[i-1]==0 && c[i]==1 && c[i+1]==0)
    		{
    			counter=counter+1;
    			System.out.println("1 no case : Counter's Value = " +counter);
    			
    			if(i+1==(c.length-1))
    			{
    				break;
    			}
    		}
    		
    		
    		else if(c[i]==0 && i==(c.length-1) && c[i-1]==1)
    		{
    			counter=counter+1;
    			//System.out.println("Last 0 case : Counter's Value = " +counter);
    		}
    		
    		
    	}
    	
    	return counter;

    }
    
    public static void main(String[] has)
    {
    	int c[] = {0, 0, 1, 0, 0, 0, 0, 1, 0, 0};
    	System.out.println(Solution.jumpingOnClouds(c));
    }
}

