package staircase;
public class Solution 
{
	public void makeStaircase(int n)
	{
		int index=0, counter=0;
		int size=n;
		for(int i=1; i<=n; i++)
		{
			size = size-1;
			while(counter < size)
			{
				System.out.print(" ");
				counter=counter+1;
			}
			counter=0;
			
			while(index < i)
			{
				System.out.print("#");
				index=index+1;
			}
			index=0;
			System.out.println("");
		}
	}
	
	public static void main(String[] harsh)
	{
		Solution t = new Solution();
		t.makeStaircase(4);
	}
}
