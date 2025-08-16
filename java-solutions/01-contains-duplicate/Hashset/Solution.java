//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> uniqueNums = new HashSet<>();

        for (int num : nums) {
            if (uniqueNums.contains(num)) {
                return true;
            }
            uniqueNums.add(num);
        }
        return false;
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] test1 = {1, 2, 3, 4};
        int[] test2 = {1, 2, 3, 1};
        int[] test3 = {};
        int[] test4 = {5, 5, 5, 5};

        System.out.println(sol.containsDuplicate(test1));
        System.out.println(sol.containsDuplicate(test2));
        System.out.println(sol.containsDuplicate(test3));
        System.out.println(sol.containsDuplicate(test4));

    }
}                                                     