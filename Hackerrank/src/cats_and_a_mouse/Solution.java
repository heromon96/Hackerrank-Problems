package cats_and_a_mouse;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) 
    {
    	String result=null, dis1=null,dis2=null;
    	int distance1 = z-x;
    	int distance2 = z-y;
    	
    	if(distance1<0)
    	{
    		dis1 = String.valueOf(distance1);
    		dis1 = dis1.substring(1, dis1.length());
    		distance1 = Integer.parseInt(dis1);
    	}
    	
    	if(distance2<0)
    	{
    		dis2 = String.valueOf(distance2);
    		dis2 = dis2.substring(1, dis2.length());
    		distance2 = Integer.parseInt(dis2);
    	}
    
    	if(distance1 < distance2)
    	{
    		result="Cat A";
    	}
    	
    	else if(distance1 > distance2)
    	{
    		result="Cat B";
    	}
    	
    	else if(distance1 == distance2)
    	{
    		result="Mouse C";
    	}
    	
    	return result;
    }

    public static void main(String[] args) 
    {
        System.out.println(Solution.catAndMouse(1, 3, 2));
    }
}
