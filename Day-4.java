/*
  An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.
*/

import java.util.Arrays;

public class PostiveNegetiveArray {
    
    public static  void arrayArrangment(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;

        while (l <= r)
        {
            if (arr[l] >= 0 && arr[r] < 0) {
                
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            } 
            else 
            {
                if (arr[l] < 0) {
                    l++;
                }
                if (arr[r] >= 0) {
                    r--;
                }
            }
        }
        
        System.out.println(" Sorted Array :");
        
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t ");
        }
        
    }

    public static void main(String[] args) {
        int[] arr = { 3, -7, 2, -8, 5, -4};
       
        arrayArrangment(arr);
    }
}
