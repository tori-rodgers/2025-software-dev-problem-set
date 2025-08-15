//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

import java.util.Arrays;

// Time & Space complexity (O(n)) ✅ 

public class SolutionTwo {

    public boolean containsDuplicate(int[] nums) {

        return Arrays.stream(nums).distinct().count() < nums.length;
    }

    public static void main(String[] args) {

        SolutionTwo sol = new SolutionTwo();

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

                                                                    