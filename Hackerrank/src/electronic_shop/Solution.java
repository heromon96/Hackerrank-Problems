package electronic_shop;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

	static int getMoneySpent(int[] keyboards, int[] drives, int b) 
    {
		int min1=keyboards[0], min2=drives[0], totalPrice=0;

		for(int i: keyboards)
		{
			if(min1 > i)
			{
				min1=i;
			}
		}
		
		for(int i: drives)
		{
			if(min2 > i)
			{
				min2=i;
			}
		}
		
		if(b < (min1+min2))
		{
			totalPrice=-1;
		}
		
		for(int i: keyboards)
		{
			for(int j: drives)
			{
				if((i+j) <= b )
				{
					if((i+j) > totalPrice)
					{
						totalPrice = i+j;						
					}
				}
			}
		}
		return totalPrice;
    }

    public static void main(String[] args)
    {
        int keyboards[] = {4};
        int drives[] = {5};
        System.out.println(Solution.getMoneySpent(keyboards, drives, 5));
    }
}

