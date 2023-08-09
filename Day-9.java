/*
  Reverse String using Recursion

*/
 public class Main {
    public static String reverseStr (String str) {
         if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        
         
        return reverseStr(str.substring(1)) + str.charAt(0);
    }
    
    public static void main(String[] args) {
        String str = "welcome";
        String reverseString = reverseStr( str);
        
        System.out.println("Reversed string: " + reverseString);
    }
}
