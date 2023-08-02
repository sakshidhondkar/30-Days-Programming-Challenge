 
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
		int no=10;
 
		 
		System.out.println(no+"'s number of occurance is "+ number_Occurance(arr, no));
						
	}

}
