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
	int n = arr.length;
	int swaps = 0;
	for (int i = 0; i < n; i++){
	if (i + 1 != arr[i]){
	int x = arr[i];
	arr[i] = i + 1;
	int j = i+1;
	if(j < n)
	for ( ; arr[j] != i+1; j++){
	if (j == n-1)
	break;
	}
	arr[j] = x;
	++swaps;
	}
	}
	return swaps;
} 
 
    
   

        public static void main(String[] args) 
    {
        	int arr[] = {-2,10,-77,-1,-59,-88,0,1,15,-3,12};
        	System.out.println("Swap" +Solution.minimumSwaps(arr));
    }
}

