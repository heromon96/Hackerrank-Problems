package home;
import java.util.*;

public class DemoTest 
{
	String s = "caberqiitefg";
	int k = 5, length, counter=0, newCounter=0;
	String newString = null;
	
	Character vowels[] = {'a','e','i','o','u'};
	
	private List<String> list = new ArrayList<>();
	
	String result = null;
	
	
	public void subStringOfLength()
	{
		length = s.length();
		int i=0, indexHolder=0;
		
		while(k<=length)
		{
			newString = s.substring(i, k);		
			
			
			char array[] = newString.toCharArray();
			
			for(char c1: array)
			{
				for(char c2: vowels)
				{
					if(c1==c2)
					{
						newCounter = newCounter+1;
					}
				}
			}
			
			
			if(newCounter > counter )
			{
				indexHolder = i;
				counter = newCounter;
				list.clear();
				list.add(newString);
				result=newString;
				
			}
			
			else if(newCounter == counter)
			{
				if(indexHolder > i)
				{
					indexHolder = i;
					counter = newCounter;
					list.clear();
					list.add(newString);
					result=newString;
				}
			}
			
			i=i+1; 	//Increasing the initial index//
			k=k+1; 	//Increasing the ending index//
			newCounter=0;
			
		}
		
		disp();
	}
	
	
	public void disp()
	{
		System.out.println(result);
	}
	
	public static void main(String[] harsh)
	{
		DemoTest dt = new DemoTest();
		dt.subStringOfLength();
	}
}
