package Level6;

// Given an array(list) strarr of strings and an integer k, return the
// first longest string consisting of k consecutive strings taken in the
// array.

public class LongestConsecString {
    public static String longestConsec(String[] strarr, int k) {
        String longestConsecutiveString = "";
        int longestLength = 0;
        for (int i = 0; i < strarr.length; i++) {
            String currentString = "";
            for (int j = i; j < i+k; j++) {
                currentString += strarr[j];
            }
            if (currentString.length() > longestLength) {
                longestConsecutiveString = currentString;
                longestLength = longestConsecutiveString.length();
            }
        }
        return longestConsecutiveString;
    }
}
