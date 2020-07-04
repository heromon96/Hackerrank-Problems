package minimum_swaps_2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
    	
    	int swapCount=0,temp, N=arr.length, index=0;
    	int min, max;
    	boolean status = false;
    	
		min = arr[0];
		for (int i = 1; i < N; i++) {
			if (min > arr[i]) {
				min = arr[i];
				index = i;
				i = 0;
				status = true;
			}
		}

		if (status == true) {
			arr[index] = arr[0];
			arr[0] = min;
			status = false;
			swapCount = swapCount + 1; // 0th index is sorted now //
		}

		
		
		
		max = arr[N - 1];
		for (int i = N - 1; i > 0; i--) {
			if (max < arr[i]) {
				max = arr[i];
				index = i;
				i = N - 1;
				status = true;
			}
		}

		if (status == true) {
			arr[index] = arr[N - 1];
			arr[N - 1] = max;
			status = false;
			swapCount = swapCount + 1; // nth index is sorted now //
		}
    	
    	
		
		
		
		
    	int counter=1;
    	while(counter<(N-2))
    	{
    		min = arr[counter];
    		for (int i = counter+1; i < N-1; i++) {
    			if (min > arr[i]) {
    				System.out.println("array[i] : " +arr[i]+ " is < " +min);
    				min = arr[i];
    				index = i;
    				i = counter;
    				status = true;
    				
    			}
    		}
    		
    		if (status == true) {
    			arr[index] = arr[counter];
    			arr[counter] = min;
    			status = false;
    			
    			counter=counter+1;
    			System.out.println(counter);
    			swapCount = swapCount + 1; // 0th index is sorted now //
    		}
    		
    		else if(status==false)
    		{
    			counter=counter+1;
    		}
    	}
    	
    	for(int a: arr)
    	{
    		System.out.println(a);
    	}
    	
    	return swapCount;
    }
 
    
   

        public static void main(String[] args) 
    {
        	int arr[] = {-2,10,-77,-1,-59,-88,0,1,15,-3,12};
        	System.out.println("Swap" +Solution.minimumSwaps(arr));
    }
}

