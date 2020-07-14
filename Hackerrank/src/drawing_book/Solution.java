package drawing_book;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) 
    {
    	int page1 = Math.abs((p) / 2);
        if(n%2==0){
            n++;
        }
        int page2 = Math.abs((p - (n)) / 2);
        return page1 < page2 ? page1 : page2;
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException 
    {
    	System.out.println(Solution.pageCount(5, 4));
    }
}

