public class Solution {
    public boolean isPalindrome(int x) {
        // Special case: Negative numbers and numbers ending in zero (except zero itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reversed = 0;
        int original = x;
        
        // Reverse the second half of the number and compare with the first half
        while (x > reversed) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        
        // If the number has odd number of digits, we can ignore the middle digit
        // For example, 12321 -> x = 12, reversed = 123
        return x == reversed || x == reversed / 10;
    }
}
