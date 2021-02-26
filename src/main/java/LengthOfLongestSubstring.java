// Given a string s, find the length of the longest substring without
// repeating characters.

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        String answer = "";
        String temp = "";
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!temp.contains("" + s.charAt(i))) {
                temp += s.charAt(i);
                if (temp.length() > answer.length()) {
                    answer = temp;
                }
            } else {
                n = temp.indexOf(s.charAt(i));
                temp = temp.substring(n + 1);
                temp += s.charAt(i);
            }
        }
        return answer.length();
    }
}