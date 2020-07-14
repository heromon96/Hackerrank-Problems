package between_two_sets;
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

class Result {
	static int count=0;
	static boolean status = false;
	static List<Integer> list = new ArrayList<>();
	static List<Integer> list1 = new ArrayList<>();
	
    public static int getTotalX(List<Integer> a, List<Integer> b) 
    {
    	Collections.sort(a);
    	Collections.sort(b);
    	
    	
    	///////////////////////////////
    	
    		for(int element: a)
    		{
    			int i=1;
    			while((element*i) <= b.get(0))
    			{
    				list.add(element*i);
        			i=i+1;	
    			}
    		}
    	
	    	
    		for(int i: list)
	    	{
    			for(int j: a)
    			{
    				if(i%j==0)
    				{
    					status=true;
    				}
    				
    				else if(i%j!=0)
    				{
    					status=false;
    					break;
    				}
    			}
    			
    			if(status==true)
    			{
    				if(!list1.contains(i))
    				{
    					list1.add(i);
    				}
    			}
	    	}
    		
    		//System.out.println(list1);
    		status=false;
    		
    		for(int i: list1)
    		{
    			for(int j: b)
    			{
    				if(j%i==0)
    				{
    					status=true;
    				}
    				
    				else if(j%i!=0)
    				{
    					status=false;
    					break;
    				}
    			}
    			Result.check(status);
    		}
    	
    	
    	return count;
    }
    
    
    
    public static void check(boolean status)
    {
    	if(status==true)
    	{
    		count=count+1;
    	}
    }

}

public class Solution {
    public static void main(String[] args) throws IOException 
    {
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);
        List<Integer> b = new ArrayList<>();
        b.add(16);
        b.add(32);
        b.add(96);
        System.out.println("Expected Output : " +Result.getTotalX(a, b));
    }
}
