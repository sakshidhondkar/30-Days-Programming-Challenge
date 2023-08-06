/*
Given an unsorted array of N integers, find smallest and largest element in optimal way.

Input: [5, 2, 9, 1, 7]
Expected Output: Smallest: 1, Largest: 9
*/

public class MinMax {
    
    public static  void largestSmallestNo(int[] arr) {
        
        int max=arr[0];
        int min=arr[0];
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            else if(arr[i]<min)
            {
                min=arr[i];
            }
            
        }
        
        System.out.println("Largest Element is "+max+" and Smallest element is "+min);
        
    }

    public static void main(String[] args) {
        int[] arr = { 3, 0, 2, 8, 5, 4,10,15};
       
        largestSmallestNo(arr);
    }
}
