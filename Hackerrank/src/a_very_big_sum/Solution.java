package a_very_big_sum;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
    	long sum=0L;
    	
    	for(long aL: ar)
    	{
    		sum=sum+aL;
    	}
    	return sum;
    }

    

    public static void main(String[] args) throws IOException {
       
    }
}
