package Test;

public class MainTest
{
	static int[] ints = {3,8,6,4,9,7,1,0,2,5};
	
	public static void main(String[] args)
	{
		Main.sortArray(ints); // bubble sort
		
		for (int x : ints)
		{
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		Main.sortArray2(ints, 0); // comb sort
		
		for (int x : ints)
		{
			System.out.print(x + " ");
		}
	}
}
