package bon_appetit;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) 
    {
    	int actualPrice=0;
    	for(int i: bill)
    	{
    		actualPrice=actualPrice+i;
    	}
    	
    	actualPrice = actualPrice-bill.get(k);
    	actualPrice = actualPrice/2;
    	if(actualPrice==b)
    	{
    		System.out.println("Bon Appetit");
    	}
    	
    	else
    	{
    		System.out.println(b-actualPrice);
    	}
    }

    public static void main(String[] args) throws IOException 
    {
    	List<Integer> bill = new ArrayList<>();
    	bill.add(3);
    	bill.add(10);
    	bill.add(2);
    	bill.add(9);
        Solution.bonAppetit(bill, 1, 12);
    }
}

