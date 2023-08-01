/*
  Challenge: Find Kth largest element in a given array.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LagestElement {

	public static int kthLargest(int[] arr, int k)
	{ 
		Arrays.sort(arr);
 
		return arr[k - 1];
	}
	
	public static void main(String[] args) {
	 
	    Scanner sc= new Scanner(System.in);
		int arr[] = new int[] {  12, 30, 15, 7, 9, 1, 85 };
		System.out.print("Enter K'th Largest element: ");
		int k= sc.nextInt();
 
		System.out.print("K'th Largest element is "
						+ kthLargest(arr, k));
	}

}
/* Input: arr[] = { 12, 30, 15, 7, 9 };
	kth number: 5
	Output: K'th Largest element is 15 
*/