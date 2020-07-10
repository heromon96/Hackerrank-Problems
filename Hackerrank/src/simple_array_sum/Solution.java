package simple_array_sum;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
    	int sum=0;
    	for(int a: ar)
    	{
    		sum = sum+a;
    	}
    	return sum;
    }

    

    public static void main(String[] args) throws IOException 
    {
        
    }
}

