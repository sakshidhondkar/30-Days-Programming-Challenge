/*Given a string, find the first non-repeated character in it. If no such character exists, return a specific value (e.g., a special character or -1) to indicate that no non-repeated character is 
  found.Given a string, find the first non-repeated character in it. If no such character exists, return a specific value (e.g., a special character or -1) to indicate that no non-repeated character 
  is found.*/

import java.util.HashMap;
import java.util.Map;

public class  Main {

    public static char findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> charFrequency = new HashMap<>();

         for (char c : str.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
 
        for (char c : str.toCharArray()) {
            if (charFrequency.get(c) == 1) {
                return c;
            }
        }
 
        return '\0';    }

    public static void main(String[] args) {
        String input = "programming";
        char result = findFirstNonRepeatedChar(input);
        
        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}
import java.util.HashMap;
import java.util.Map;

public class  Main {

    public static char findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> charFrequency = new HashMap<>();

         for (char c : str.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
 
        for (char c : str.toCharArray()) {
            if (charFrequency.get(c) == 1) {
                return c;
            }
        }
 
        return '\0';    }

    public static void main(String[] args) {
        String input = "programming";
        char result = findFirstNonRepeatedChar(input);
        
        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}

/*Output : */
