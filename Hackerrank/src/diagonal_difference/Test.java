package diagonal_difference;

public class Test 
{
	public static void findDiagonal(int array[][])
	{
		int leftDiagonal=0;
		int rightDiagonal=0;
		
		//loop for left diagonal//
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=i; j<array.length; j++)
			{
				if(i==0)
				{
					leftDiagonal=leftDiagonal+array[i][j];
					break;
				}
				
				else if(i>0)
				{
					leftDiagonal=leftDiagonal+array[i][j];
					break;
				}
			}
		}
		
		int length = array.length-1;
		
		for(int i=length; i>=0; i--)
		{
			for(int j=i; j>=0; j--)
			{
				if(i==length)
				{
					rightDiagonal=rightDiagonal+array[i][j];
					break;
				}
				
				else if(i<length)
				{
					rightDiagonal=rightDiagonal+array[i][j];
					break;
				}
			}
		}
		
		
		
		int absoluteDiff = leftDiagonal-rightDiagonal;
		System.out.println("Answer : " +absoluteDiff);
	}
	
	public static void main(String[] harsh)
	{
		int array[][] = {{10,20,30}, {40,50,60}, {70,80,90}};
		Test.findDiagonal(array);
	}
}
