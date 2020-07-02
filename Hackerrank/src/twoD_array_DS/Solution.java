package twoD_array_DS;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) 
    {
    	int horizontalIndex=0, verticalIndex=0, max=0, i=0,j=0;
    	List<Integer> list = new ArrayList<>();
    	
    	while(verticalIndex <= (arr.length-3))
		{
		
		while(horizontalIndex <= (arr.length-3))
		{
			for(i=verticalIndex; i<(3+verticalIndex); i++)
			{
			
				for(j=horizontalIndex; j<(3+horizontalIndex); j++)
				{
						max=max+arr[i][j];
				}
			}
			
				
				max=max-(arr[i-2][j-3]+arr[i-2][j-1]);
			
			
			list.add(max);
			max=0;
			horizontalIndex=horizontalIndex+1;
		}
			horizontalIndex=0;
			verticalIndex=verticalIndex+1;
		}
    	
    	max=0;
    	for(int a: list)
    	{
    		if(a>max)
    		{
    			max=a;
    		}
    	}
    	
    	return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
