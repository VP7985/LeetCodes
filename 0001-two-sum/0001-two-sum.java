import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store each element and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement (target - nums[i]) exists in the map
            if (map.containsKey(complement)) {
                // If found, return the indices of current element and its complement
                return new int[] { map.get(complement), i };
            }
            
            // Store the current element and its index in the map
            map.put(nums[i], i);
        }
        
        // In case no solution is found (although the problem guarantees exactly one solution)
        throw new IllegalArgumentException("No two sum solution");
    }
}
