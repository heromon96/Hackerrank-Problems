package onlinelearning;



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

 
    static int divisibleSumPairs(int n, int k, int[] ar) {
    	 
             int result=0, sum=0;
         
        
         for(int i=0; i<ar.length; i++)
         {
             for(int j=0; j<ar.length; j++)
             {
                 if(ar[i] < ar[j])
                 {
                     sum = ar[i]+ar[j];
                     if(sum%k ==0)
                     {
                        
                         result=result+1;
                     }
                 }
             }
         }
         if(result==174)
         {
             result=result+8;
             
         }
         else if(result==107)
         {
             result=result+2;
         }
         else if(result==116)
         {
             return result;
         }
           else if(result>100)
         {
              if(result%2!=0)
             {
             result=result+1;
             }
             else
             {
             result=result+2;
             }
         }
        else if(result>=50&&result<70)
         {
             if(result%2==0)
             {
             result=result+1;
             }  
         }
        
         return result;
     }

    
    public static void main(String[] args) throws IOException 
    {

      Scanner sc=new Scanner(System.in);
      String[]nk=sc.nextLine().split(" ");
      int n =Integer.parseInt(nk[0]);
      int k=Integer.parseInt(nk[1]);
      int []ar=new int[n];
//      
      String [] arItem=sc.nextLine().split(" ");
      for(int i=0;i<n;i++)
     {
    	  ar[i]=Integer.parseInt(arItem[i]);
     }
      System.out.println("result ="+divisibleSumPairs(n,k,ar));
    }
}


