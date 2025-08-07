// Contains Duplicate

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 
// This solution is the same time space complexity (O(n)) but far more steps.
// Both use Sets, which are similar to Hash Sets in Java & Python.

/*
class Solution {
    hasDuplicate(nums) {
        const seen = new Set();
        for (const num of nums) {
            if (seen.has(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

const solution = new Solution();
console.log(solution.hasDuplicate(nums));
*/


class Solution {
    hasDuplicate(nums) {
        return new Set(nums).size < nums.length;
    }
}

const solution = new Solution();    // Create a new instance of Solution

const nums = [1,2,3,4,5,6,6];
console.log(solution.hasDuplicate(nums));

// or 

console.log(solution.hasDuplicate([1, 2, 3, 3, 4]));
console.log(solution.hasDuplicate([1, 2, 3, 4]));


/* Using the class Solution is standard for Leetcode, also allows encapsulation & reusability. 
Adds utitility for OOP (ex. inheritance)
Set is a built-in JS object that stores *unique* values. 
When the nums array is passed into new Set, it removes the duplicates. 
The return evaluates the length of the new Set and the original array. 
Returns true if the length of the new Set is less than the length of the original array / false if they are the same. 
*/

