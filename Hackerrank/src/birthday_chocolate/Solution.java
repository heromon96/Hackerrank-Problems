package birthday_chocolate;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
    	
    	int countNoOFWays=0, sum=0, size=s.size(), counter=0;
        
        for(int i=0; i<=size-m; i++)
        {
        	if(s.size()==1)
        	{
        		sum = s.get(i);
        		if(sum==d && (i+1)==m)
        		{
        			countNoOFWays = countNoOFWays+1;
        			break;
        		}
        	}
        	
        	for(int j=i; j<size; j++)
        	{
        		sum = sum+s.get(j);
        		
        		System.out.println("Sum = " +sum);
        		counter = counter+1;
        		System.out.println("Counter = " +counter);
        		System.out.println("");
        		
        		if(sum==d && counter==m)
        		{
        			countNoOFWays = countNoOFWays+1;
        			sum=0;
        			counter=0;
        			break;
        			//System.out.println("Result :" +countNoOFWays);
        		}
        		
        		else if(sum!=d && counter==m)
        		{
        			//i=i-1;
        			sum=0;
        			counter=0;
        			break;
        		}
        	}
        }
        
        return countNoOFWays;
    }

    public static void main(String[] args) throws IOException 
    {
        List<Integer> s = new ArrayList<>();
        s.add(4);
        s.add(5);
        s.add(4);
        s.add(2);
        s.add(4);
        s.add(5);
        s.add(2);
        s.add(3);
        s.add(2);
        s.add(1);
        s.add(1);
        s.add(5);
        s.add(4);
//        s.add(1);
//        s.add(3);
//        s.add(3);
//        s.add(4);
//        s.add(2);
//        s.add(1);
        System.out.println(Solution.birthday(s, 15, 4));
    }
}

