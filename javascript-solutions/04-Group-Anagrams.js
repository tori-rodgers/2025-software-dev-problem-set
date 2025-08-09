/*  Given an array of strings strs, group the anagrams together. You can return the answer in any order.

Example: 
Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]  */

const strs = ["eat", "tea", "tan", "ate", "nat", "bat"];


class Solution {
    groupAnagrams(strs) {
        const res = {};
        for (let s of strs) {
            const count = new Array(26).fill(0);
            for (let c of s) {
                count[c.charCodeAt(0) - 'a'.charCodeAt(0)] += 1;
            }
            const key = count.join(',');
            if (!res[key]) {
                res[key] = [];
            }
            res[key].push(s);
        }
        return Object.values(res);
    }
}

console.log(new Solution().groupAnagrams(strs));
