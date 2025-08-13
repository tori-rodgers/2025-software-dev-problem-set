//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

// Time & Space complexity O(n) ✅

class Solution {

    hasDuplicate(nums) {
        return new Set(nums).size < nums.length;
    }
}


const test1 = [1, 2, 3 ,4];
const test2 = [1, 2, 3, 1];
const test3 = [];
const test4 = [5, 5, 5, 5];

const solution = new Solution();    // Create a new instance of Solution

console.log(solution.hasDuplicate(test1));      // false
console.log(solution.hasDuplicate(test2));      // true
console.log(solution.hasDuplicate(test3));      // false
console.log(solution.hasDuplicate(test4));      // true

// or input directly

console.log(solution.hasDuplicate([1, 2, 3, 4]));
console.log(solution.hasDuplicate([1, 2, 3, 1]));