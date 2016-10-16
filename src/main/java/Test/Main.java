package Test;

public class Main
{
	public static void sortArray(int[] arr) // bubble sort
	{
		for(int i = arr.length-1; i > 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void sortArray2(int[] m, int n) // comb sort
	{	
		int tmp; 
		int k;
		int s = n; 								
		while(n > 1) 
		{
			s = (int) (s / 1.247f);
	                                        	
			if (s < 1)
			{
				s = 1;	
			}
			
			k = 0;
			
			for (int i = 0; i + s < n; ++i) 
			{ 								
				if(m[i] > m[i + s]) 
				{
					tmp = m[i];
					m[i] = m[i + s];
					m[i + s] = tmp; 	
					k = i;
				}
			}
			if (s == 1)
				n = k + 1; 
		}
	}
}
