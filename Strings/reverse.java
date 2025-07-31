package Strings;

public class reverse {
   public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        reverse obj = new reverse();
        System.out.println(obj.reverseWords("girls beautiful is a yamuna"));
    }
}

//run:- javac Strings/reverse.java THEN:- java Strings.reverse