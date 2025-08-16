/* Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first. */ 


import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] test1 = sol.twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] test2 = sol.twoSum(new int[]{3, 2, 4}, 6);
        int[] test3 = sol.twoSum(new int[]{1, 2, 3}, 7);

        System.out.println(Arrays.toString(test1)); //  [0, 1]
        System.out.println(Arrays.toString(test2)); //  [1, 2]
        System.out.println(Arrays.toString(test3)); //  []
    }
}