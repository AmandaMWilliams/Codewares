package Medium;

public class FirstUniqueChar {
    public static int firstUniqChar(String s) {
        int indexToReturn = -1;
        if (s.length() == 1) {
            return 0;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i == j) {
                    continue;
                }
                if (s.charAt(i) == s.charAt(j)) {
                    break;
                }
                if (j == s.length() - 1 && s.charAt(i) != s.charAt(j)) {
                    indexToReturn = i;
                    return indexToReturn;
                }
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            char currentCharacter = s.charAt(i);
            char lastCharacter = s.charAt(s.length() - 1);
            if (currentCharacter == lastCharacter) {
                break;
            }
            if (i == s.length() - 2 && currentCharacter != lastCharacter) {
                indexToReturn = s.length() - 1;
                return indexToReturn;
            }
        }
        return indexToReturn;
    }
}
