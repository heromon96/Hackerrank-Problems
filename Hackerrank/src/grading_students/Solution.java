package grading_students;

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
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    	List<Integer> list = new ArrayList<>();
    	int fiveMultiple=0, difference=0;
    	
    	for(int g: grades)
    	{
    		if(g < 38)
    		{
    			list.add(g);
    		}
    		
    		else if(g > 38 || g == 38)
    		{
    			if(g%5==0)
    			{
    				list.add(g);
    			}
    			
    			else
    			{
    			for(int i=1; i<=20; i++)
    			{
    				fiveMultiple = 5*i;
    				
    				if(fiveMultiple > g)
    				{
    					difference = fiveMultiple-g;
    					if(difference < 3)
    					{
    						list.add(fiveMultiple);
    					}
    					
    					else
    					{
    						list.add(g);
    					}
    					break;
    				}
    			}
    		}
    		}
    	}
    	
    	return list;
    }

}
	
	public class Solution 
	{
    public static void main(String[] args) 
    {
    	List<Integer> grades = new ArrayList<>();
    	grades.add(36);
    	grades.add(6);
    	grades.add(98);
    	grades.add(25);
    	grades.add(97);
    	grades.add(24);
    	grades.add(25);
    	grades.add(70);
    	grades.add(50);
    	grades.add(71);
    	grades.add(30);
    	grades.add(14);
    	grades.add(28);
    	grades.add(100);
    	grades.add(93);
    	grades.add(25);
    	grades.add(36);
    	grades.add(6);
    	grades.add(98);
    	grades.add(25);
    	grades.add(36);
    	grades.add(6);
    	grades.add(98);
    	grades.add(25);
        System.out.println(Result.gradingStudents(grades));
    }
}

