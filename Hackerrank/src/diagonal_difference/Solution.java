package diagonal_difference;

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

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    	int leftDiagonal=0, rightDiagonal=0, absoluteDifference=0, index=0;
		
		for(List<Integer> i: arr)
		{
			for(Integer j: i)
			{
				if(arr.indexOf(i)==0)
				{
					leftDiagonal=leftDiagonal+j;
					index=index+1;
					break;
				}
				
				else if(arr.indexOf(i)>0)
				{
					leftDiagonal=leftDiagonal+i.get(index);
					index=index+1;
					break;
				}
			}
		}
		
		index=(arr.size()-1);
		
		for(List<Integer> i: arr)
		{
			for(Integer j: i)
			{
				if(arr.indexOf(i) == (i.size()-1))
				{
					rightDiagonal=rightDiagonal+j;
					index=index-1;
					break;
				}
				
				else if(arr.indexOf(i) < (i.size()-1))
				{
					rightDiagonal=rightDiagonal+i.get(index);
					index=index-1;
					break;
				}
			}
		}
		
		absoluteDifference = leftDiagonal-rightDiagonal;
		String s = String.valueOf(absoluteDifference);
		
		if(s.contains("-"))
		{
			s=s.substring(1, s.length());
		}
		absoluteDifference = Integer.parseInt(s);
		return absoluteDifference;
	}

}

	public class Solution {
    public static void main(String[] args) throws IOException 
    {
    	List<List<Integer>> arr = new ArrayList<List<Integer>>();
    	arr.add(new ArrayList<Integer>());
    	arr.get(0).add(0,10);
    	arr.get(0).add(1,20);
    	arr.get(0).add(2,30);
    	arr.add(new ArrayList<Integer>());
    	arr.get(1).add(0,40);
    	arr.get(1).add(1,50);
    	arr.get(1).add(2,60);
    	arr.add(new ArrayList<Integer>());
    	arr.get(2).add(0,70);
    	arr.get(2).add(1,80);
    	arr.get(2).add(2,90);
    	System.out.println(arr);
    	System.out.println(Result.diagonalDifference(arr));
    }
}
