package mini_max_sum;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) 
    {
    	int N=arr.length,k=0,i, temp;
    	
    	for(k=0; k<=N-1; k++)
        {
            for(i=k; i>0; i--)
            {
                if(arr[i-1] > arr[i])
                {
                    temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
         }
    	
    	long sum=0L;
    	List<Long> list = new ArrayList<>();
    	
    	for(int a=0; a<arr.length-1; a++)
    	{
    		sum=sum+arr[a];
    	}
    	list.add(sum);
    	sum=0;
    	
    	for(int a=1; a<arr.length; a++)
    	{
    		sum=sum+arr[a];
    	}
    	list.add(sum);
    	
    	if(list.get(0) < list.get(1))
    	{
    	System.out.println(list.get(0)+ " " +list.get(1));
    	}
    	
    	else if(list.get(0) > list.get(1)) 
    	{
    		System.out.println(list.get(1)+ " " +list.get(0));
    	}
    	
    	else if(list.get(0) == list.get(1))
    	{
    		System.out.println(list.get(0)+ " " +list.get(1));
    	}
    }


    public static void main(String[] args) 
    {
        int arr[] = {7,69,2,221,8974};
        Solution.miniMaxSum(arr);
    }
}

