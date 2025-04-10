// Contains Duplicate

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 
const nums = [1,2,3,4,5,6,6];

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
