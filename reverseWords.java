// Problem: Reverse Words in a String
// Link: https://leetcode.com/problems/reverse-words-in-a-string/
// Category: Strings
// Level: Easy
// Language: Java


package Strings;

class Solution {
    public String reverseWords(String s) {
     String[] words = s.trim().split("\\s+") ;
     StringBuilder reversed = new StringBuilder();
     for (int i = words.length-1; i >= 0; i--) {
        reversed.append(words[i]);
        if (i != 0) {
            reversed.append(" ");
        }
     }
     return reversed.toString();
    }
    public static void main(String[] args) {
      Solution sol = new Solution();
        System.out.println(sol.reverseWords("  girls beautifull is a yamuna "));
    }
}
