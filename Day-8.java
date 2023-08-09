/*
  How do you check if two strings are anagrams of each other?

String 1: "listen"
String 2: "silent"
Expected Output: True

An anagram of a string is another string that uses the same characters, but the order of characters can be different
*/

 import java.util.Arrays;

public class Main {
    public static boolean areAnagrams(String str1, String str2) {
      
        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();
        
    
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
      
        return Arrays.equals(arr1, arr2);
    }
    
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean rs = areAnagrams(str1, str2);
        if(rs==true)
            System.out.println("Strings are Angram.");  
        else
             System.out.println("Strings are not Angram.");  
        
    }
}
