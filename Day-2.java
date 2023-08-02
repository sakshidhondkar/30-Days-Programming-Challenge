//DAy -2 : Given a sorted array arr[] and a number x, write a function that counts the occurances of x in arr[] 
import java.util.Scanner;

public class Day_2 {


	public static int number_Occurance(int[] arr, int no)
	{ 
		int count=0;
		
		 
		for(int i=0;i<arr.length;i++)
		{
			if(no==arr[i])
			{
				count++;
			}
		}
		return count;
  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int arr[] = new int[] { 7,8,8, 8, 10, 10, 10, 10, 20, 30, 80 };
		int x=10;
 
		 
		System.out.println(x+"'s number of occurance is "+ number_Occurance(arr, x));
						
	}

}
