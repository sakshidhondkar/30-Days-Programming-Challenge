/*
Given an array of N integers, and an integer K, the task is to find the number of pairs of integers in the array whose sum is equal to K.
*/
 
	public class Day_4  {
		public static void main(String args[])
		{
			int[] arr = { 1, 0, 7, -1, 5 };
			int K = 6;
		 
			pairsCount(arr, K);
		}
 
		public static void pairsCount(int[] arr, int K)
		{
			 
			int count = 0;

			 
			for (int i = 0; i < arr.length; i++)
				for (int j = i + 1; j < arr.length; j++)
					if ((arr[i] + arr[j]) == K)
						count++;

			System.out.printf("Count of pairs is %d", count);
		}
	}

 


