//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

import java.util.HashSet;
import java.util.Set;


// Time & Space complexity (O(n)) ✅ 

public class SolutionOne {

    public boolean containsDuplicate(int[] nums) {  // Method takes one paramater - and array of integers named nums

       
         Set<Integer> uniqueNums = new HashSet<>();     /* Set is an interface and assigning it the HashSet implementation 
                                                        (allows flexibility in code because you can assign a different set type later if needed)
                                                        HashSet stores only unique elements. Declares a variable named uniqueNums that holds a set of Integer objects
                                                        Integer is a wrapper class for the primitive type int. Java collections like HashSet work with objects, 
                                                        not primitives so we use Integer */

              for (int num : nums) {                    /* int num declares a variable num that holds each value from the array nums
                                                        : nums "for each element in the array nums" */
        

                if (uniqueNums.contains(num)) {         // Checks if the set contains the number, if it does, returns true
                    return true;
             }

                uniqueNums.add(num);                    // If it wasn't already in the set, it adds it
        }

        return false;
    }





    
    public static void main(String[] args) {      /* static: belongs to this class, not an instance so it can run without creating an object first
                                                    void: doesn't return anything, just runs the code
                                                    main: method the JVM (Java Virtual Machine) looks for to start execution */

        SolutionOne sol = new SolutionOne();      // new Solution() initializes a new object/instance of Solution

        int[] test1 = {1, 2, 3, 4};
        int[] test2 = {1, 2, 3, 1};
        int[] test3 = {};
        int[] test4 = {5, 5, 5, 5};

        System.out.println(sol.containsDuplicate(test1));   // false
        System.out.println(sol.containsDuplicate(test2));   // true
        System.out.println(sol.containsDuplicate(test3));   // false
        System.out.println(sol.containsDuplicate(test4));   // true

    }
}

