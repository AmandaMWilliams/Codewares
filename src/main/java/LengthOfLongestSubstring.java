// Given a string s, find the length of the longest substring without
// repeating characters.

public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    counter++;
                }
            }
        } return counter;
    }
}
