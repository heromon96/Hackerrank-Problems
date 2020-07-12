package migratory_birds;

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

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) 
    {
    	int counter=0, max=0, key=0;
    	List<Integer> array = new ArrayList<>();
    	Map<Integer, Integer> map = new HashMap<>();
    	Set<Map.Entry<Integer, Integer>> set = map.entrySet();
    	
    	array.addAll(arr);
    	
    	Collections.sort(array);
    	
    	for(int i=0; i<array.size(); i++)
    	{
    		for(int j=0; j<arr.size(); j++)
    		{
    			if(array.get(i) == arr.get(j))
    			{
    				counter=counter+1;
    			}
    		}
    		map.put(array.get(i), counter);
//    		System.out.println("array[i] = " +array.get(i)+ " Counter = " +counter);
    		counter=0;
    	}
    	
    	
    	for(Map.Entry<Integer, Integer> mp : set)
    	{
    		if(mp.getValue() > max)
    		{
        		max = mp.getValue();    
        		key = mp.getKey();
    		}
    		
    		else if(mp.getValue() == max)
    		{
    			if(mp.getKey() < key)
    			{
    				key = mp.getKey();
    			}
    		}

    	}
    	
    	return key;
    	
    }

    public static void main(String[] args) throws IOException 
    {
    	List<Integer> arr = new ArrayList<>();
    	arr.add(1);
    	arr.add(2);
    	arr.add(3);
    	arr.add(4);
    	arr.add(5);
    	arr.add(4);
    	arr.add(3);
    	arr.add(2);
    	arr.add(1);
    	arr.add(3);
    	arr.add(4);
    	System.out.println(Solution.migratoryBirds(arr));
    }
}

