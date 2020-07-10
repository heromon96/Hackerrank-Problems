package birthday_cake_candles;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
    	int candlesCount=0;
    	int max=0;
    	List<Integer> list = new ArrayList<>();
    	
    	for(int a: ar)
    	{
    		if(a>max)
    		{
    			max=a;
    			list.clear();
    			list.add(a);
    		}
    		
    		else if(a==max)
    		{
    			max=a;
    			list.add(a);
    		}
    	}
    	
    	candlesCount=list.size();
    	
    	return candlesCount;
    }

   
    public static void main(String[] args) throws IOException 
    {
    	int ar[] = {4,4,1,3};
    	System.out.println(Solution.birthdayCakeCandles(ar));
    }
}
