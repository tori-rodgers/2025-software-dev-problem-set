// Given two strings s and t, return true if t is an anagram of s and false otherwise.

class Solution {
    validAnagram(s, t) {
        if (s.length !== t.length) {
            return false;
        }

        const count = new Array(26).fill(0);
        for (let i = 0; i < s.length; i++) {
            count[s.charCodeAt(i) - 'a'.charCodeAt(0)]++;
            count[t.charCodeAt(i) - 'a'.charCodeAt(0)]--;
        }

        return count.every(c => c === 0);
    }

}

console.log(new Solution().validAnagram("anagram", "anagrams")); // false
console.log(new Solution().validAnagram("anagram", "margana")); // true
console.log(new Solution().validAnagram("cat", "dog")); // false