//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

import java.util.Arrays;

// Time & Space complexity (O(n)) ✅ 

public class Solution {

    public boolean containsDuplicate(int[] nums) {

        return Arrays.stream(nums).distinct().count() < nums.length;
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        System.out.println(sol.containsDuplicate(new int[] {1, 2, 3, 3}));
        System.out.println(sol.containsDuplicate(new int[] {1, 2, 3, 1}));
    }
}

