import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        
        // Map to store the last occurrence index of each character
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0; // Start of the current substring
        
        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            
            if (map.containsKey(currentChar)) {
                // Update the start of the substring to the next position after the last occurrence
                start = Math.max(start, map.get(currentChar) + 1);
            }
            
            // Update the last occurrence index of the current character
            map.put(currentChar, end);
            
            // Update the maximum length of the substring without repeating characters
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }
}
