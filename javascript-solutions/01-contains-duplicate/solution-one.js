//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
 
// Time & Space complexity O(n) ✅


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


const test1 = [1, 2, 3 ,4];
const test2 = [1, 2, 3, 1];
const test3 = [];
const test4 = [5, 5, 5, 5];

const solution = new Solution();   // Create a new instance of Solution

console.log(solution.hasDuplicate(test1));      // false
console.log(solution.hasDuplicate(test2));      // true
console.log(solution.hasDuplicate(test3));      // false
console.log(solution.hasDuplicate(test4));      // true

// or input directly

console.log(solution.hasDuplicate([1, 2, 3, 4]));
console.log(solution.hasDuplicate([1, 2, 3, 1]));


// Both solutions use Sets, which are similar to Hash Sets in Java

/* 
Using the class Solution is standard for Leetcode, also allows encapsulation & reusability. 
Adds utitility for OOP (ex. inheritance)
Set is a built-in JS object that stores *unique* values. 
When the nums array is passed into new Set, it removes the duplicates. 
The return evaluates the length of the new Set and the original array. 
Returns true if the length of the new Set is less than the length of the original array / false if they are the same. 
*/



