import java.util.ArrayList;
import java.util.List;

/*
 		Given an array arr[] of non-negative integers and an integer sum, 
 		find a subarray that adds to a given sum. There may be more than one 
 		subarray with sum as the given sum, print first such subarray.
 */
 

 
		public class Day_3 {

		    public static List<Integer> findSubarrayWithSum(int[] arr, int targetSum) {
		        List<Integer> subarray = new ArrayList<>();
		        int n = arr.length;
		        int start = 0;
		        int currentSum = 0;

		        for (int end = 0; end < n; end++) {
		            currentSum += arr[end];

		            while (currentSum > targetSum && start < end) {
		                currentSum -= arr[start];
		                start++;
		            }

		            if (currentSum == targetSum) {
		                for (int i = start; i <= end; i++) {
		                    subarray.add(arr[i]);
		                }
		                return subarray;
		            }
		        }

		        return null;
		    }

		    public static void main(String[] args) {
		        int[] arr = {8, 7, 15, 6, 10};
		        int targetSum = 17;

		        List<Integer> result = findSubarrayWithSum(arr, targetSum);
		        if (result != null) {
		            System.out.println("Subarray with sum " + targetSum + ": " + result);
		        } else {
		            System.out.println("No subarray found with sum " + targetSum);
		        }
		    }
		}
 
