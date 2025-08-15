// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

public class SolutionNotes {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];                  // Creates an array of integers named count with 26 elements
                                                    // All values are intiialized to 0 because it's a primitive int array
        for (int i = 0; i < s.length(); i++) {      

            count[s.charAt(i) - 'a']++;             /*  Gets the character at position i in s, convert that character to a number between 0 and 25
                                                        Each index in the array [26] corresponds to a letter.
                                                        'a' - 'a' = 0, 'b' - 'a' = 1, 'z' - 'a' = 25. 
                                                        This finds the value of s */
                                            
            count[t.charAt(i) - 'a']--;             // Same thing here except it's subtracting to get a negative number
                                                    // These 2 values will cancel out if it's an angagram
        }

        for (int val : count) {                     // Compares the value of count to 0 (true for isAnagram)
            if (val != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SolutionNotes sol = new SolutionNotes();

        System.out.println(sol.isAnagram("anagram", "ngraaam"));
    }

}