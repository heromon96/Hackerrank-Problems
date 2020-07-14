package picking_numbers;

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
	static int maxLength=0;
	static boolean status = false;
	static List<Integer> array = new ArrayList<>();
	static List<Integer> array1 = new ArrayList<>();
    
	public static int pickingNumbers(List<Integer> a) 
    {
		Collections.sort(a);
		int min=0;
		
			for(int i=0; i<a.size(); i++)
			{
				min = a.get(i);
				if(i==0)
				{
					array1.add(min);					
				}

				//System.out.println("New Minimum = " +min);
				
				for(int j=1; j<a.size(); j++)
				{
					if(a.get(j) == min+1)
					{
						array1.add(a.get(j));
						status=true;
						//System.out.println("Adding array[j] > " +a.get(j));
					}
					
					else if(a.get(j) == min)
					{
						array1.add(a.get(j));
						status=true;
						//System.out.println("Adding array[j] = " +a.get(j));
					}
				}
				
				if(status==true)
				{
					array.add(array1.size());
					array1.clear();
				}
				
				else if(status==false)
				{
					array1.clear();
					//System.out.println("Clearing....");
				}
			}
		
		//System.out.println(array1);
		
		if(array1.size()==1)
		{
			array1.clear();
		}
		
		for(int size: array)
		{
			if(size > maxLength)
			{
				maxLength = size;
			}
		}

		return maxLength;
    }

}

	public class Solution {
    public static void main(String[] args) throws IOException 
    {
    	List<Integer> a = new ArrayList<>();
    	a.add(1);
    	a.add(2);
    	a.add(2);
    	a.add(3);
    	a.add(1);
    	a.add(2);
    	System.out.println(Result.pickingNumbers(a));
    }
}

