// 🔗 Problem: https://leetcode.com/problems/longest-common-prefix/
// ✅ Solved by: YamunaCodes



package Arrays;

 class longestcommonprefix {
  public String Longestcommonprefix(String[] strs) {
    if(strs == null || strs.length == 0)
    return "";

    String prefix = strs[0];

    for(int i = 1; i < strs.length; i++) {
      while (strs[i].indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.isEmpty())
        return "";
      }
    }
    return prefix;
  }
  public static void main(String[] args) {
    longestcommonprefix obj = new longestcommonprefix();
    String[] input = {"flower", "flow", "flight"};
    String result = obj.Longestcommonprefix(input);

    System.out.println("Longest Common Prefix: " + result);
  }
}

// run:- javac Arrays\longestcommonprefix.java THEN java Arrays.longestcommonprefix