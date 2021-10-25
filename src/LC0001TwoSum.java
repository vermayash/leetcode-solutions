
/**
 * LeetCode 1. Two Sum
 * October 24, 2021
 * Difficulty: Easy
 * Language: Java
 */

import java.util.*;

class LC0001TwoSum {
    /**
     * Brute Force Approach
     * 
     * Time taken: 47 ms, Memory usage: 39.6 MB.
     * 
     * Time taken to write and execute: 11m 15sec.
     * 
     * time complexity: O(n^2) space complexity: O(1)
     * 
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[] { i, j };
            }
        }

        return new int[] { -1, -1 };
    }

    /**
     * Optimized solution using HashMap.
     * 
     * Time taken: 3ms, memory used: 42.6 MB.
     * 
     * Time complexity: O(n). Space complexity: O(n).
     * 
     * time taken to come up with the solution and execute is successfully: 15m
     * 12sec.
     * 
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (hm.containsKey(diff)) {
                return new int[] { hm.get(diff), i };
            }

            hm.put(nums[i], i);
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 4 };
        int target = 6;

        LC0001TwoSum ts = new LC0001TwoSum();
        System.out.println(Arrays.toString(ts.twoSum2(nums, target)));
    }
}