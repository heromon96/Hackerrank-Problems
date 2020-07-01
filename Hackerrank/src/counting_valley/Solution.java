package counting_valley;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) 
    {
    	int mountain=0,sea_level=0, counter=0;
    	char array[]=s.toCharArray();
    	
    	for(char c: array)
    	{
    		if(c=='U' && mountain==0 && sea_level==0)
    		{
    			mountain=mountain+1;
    		}
    		
    		else if(c=='D' && sea_level==0  && mountain==0)
    		{
    			sea_level=sea_level+1;
    		}
    		
    		
    		
    		else if(c=='U' && mountain>0)
    		{
    			mountain=mountain+1;
    		}
    		
    		else if(c=='D' && mountain>0)
    		{
    			mountain=mountain-1;
    		}
    		
    		
    		
    		else if(c=='D' && sea_level>0)
    		{
    			sea_level=sea_level+1;
    		}
    		
    		else if(c=='U' && sea_level>0)
    		{
    			sea_level=sea_level-1;
    			if(sea_level==0)
    			{
    				counter = counter+1;
    			}
    		}
    	}
    	
    	return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

