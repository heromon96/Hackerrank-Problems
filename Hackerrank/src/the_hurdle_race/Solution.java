package the_hurdle_race;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) 
    {
    	int doseCount=0, max=0;
    	
    	for(int i: height)
    	{
    		if(i > max)
    		{
    			max=i;
    		}
    	}
    	
    	if(max > k)
    	{
    		doseCount = max-k;
    	}
    	
    	return doseCount;
    }

    public static void main(String[] args) throws IOException 
    {
      int height[] = {2,5,4,5,2};
      System.out.println(Solution.hurdleRace(7, height));
    }
}

