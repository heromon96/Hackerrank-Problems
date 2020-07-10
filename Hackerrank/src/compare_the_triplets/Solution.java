package compare_the_triplets;

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

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	List<Integer> list = new ArrayList<>();
    	int counter=0, score1=0, score2=0;
    	for(int i=0; i<a.size(); i++)
    	{
    		for(int j=counter; j<b.size(); j++)
    		{
    			if(a.get(i) > b.get(j))
    			{
    				score1=score1+1;
    				counter=counter+1;
    				break;
    			}
    			
    			else if(a.get(i) < b.get(j))
    			{
    				score2=score2+1;
    				counter=counter+1;
    				break;
    			}
    			
    			else if(a.get(i) == b.get(j))
    			{
    				counter=counter+1;
    				break;
    			}
    		}
    	}
    	list.add(score1);
		list.add(score2);
    	
    	return list;
    }

    public static void main(String[] args) throws IOException 
    {
    	List<Integer> a = new ArrayList<>();
    	a.add(1);
    	a.add(2);
    	a.add(3);
    	List<Integer> b = new ArrayList<>();
    	b.add(1);
    	b.add(2);
    	b.add(3);
    	System.out.println(Solution.compareTriplets(a, b));
    }
}

