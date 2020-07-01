package socks_problem;
import java.io.*;
import java.util.*;


public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) 
    {
    	int counter =0;
    	List<Integer> pairs = new ArrayList<>();
    	
    	for(int i: ar)
    	{
    		if(pairs.isEmpty())
    		{
    			pairs.add(Integer.valueOf(i));
    		}
    		
    		else if(!pairs.isEmpty())
    		{
    			for(int j: pairs)
    			{
    				if(i==j)
    				{
    					counter = counter+1;
    					pairs.remove(pairs.indexOf(j));
    					break;
    				}
    				
    				else if(i!=j && pairs.indexOf(j)==(pairs.size()-1))
    				{
    					pairs.add(Integer.valueOf(i));
    					break;
    				}
    			}
    		}
    	}
    	pairs.clear();
    	
    	return (ar.length-pairs.size());
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

