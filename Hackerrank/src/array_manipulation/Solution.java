
package array_manipulation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long array[] = new long[n];
        int a=0,b=0,k=0;
        long max=0L;
        
        int size = queries.length;
        
            for(int row =0; row<size; row++)
            {
                for(int col=0; col<size; col++)
                {
                    if(col==0)
                    {
                        a = queries[row][col];
                    }
                    
                    else if(col==1)
                    {
                        b = queries[row][col];
                    }
                    
                    else if(col==2)
                    {
                        k = queries[row][col];
                    }
                }
                    a = a-1;
                    for(int add=a; add<b; add++)
                    {
                        array[add]=array[add]+k;
                        //System.out.println(array[add]);
                        if(max<array[add])
                        {
                            max = array[add];
                        }
                    }
            }
            
            return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int queries[][] = {{1,2,100},{2,5,100},{3,4,100}};
        System.out.println(Solution.arrayManipulation(5, queries));
    }
}

