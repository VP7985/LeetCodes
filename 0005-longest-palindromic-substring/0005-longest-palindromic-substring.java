class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) {
            return "";
        }

        // Initialize dp table
        boolean[][] dp = new boolean[n][n];
        int start = 0;
        int maxLen = 1;

        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // Check for substrings of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLen = 2;
            }
        }

        // Check for substrings of length > 2
        for (int length = 3; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    if (length > maxLen) {
                        start = i;
                        maxLen = length;
                    }
                }
            }
        }

        return s.substring(start, start + maxLen);
    }
}

public class Main {
    public static void main(String[] args) {
        String s1 = "babad";
        String s2 = "cbbd";
        
        String longest1 = new Solution().longestPalindrome(s1);
        String longest2 = new Solution().longestPalindrome(s2);
        
        System.out.println(longest1);  // Output: "bab" or "aba"
        System.out.println(longest2);  // Output: "bb"
    }
}
