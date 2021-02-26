package Easy;// Check to see if a string has the same amount of 'x's and 'o's. The
// method must return a boolean and be case insensitive. The string can contain any char.

public class ExesAndOhs {
    public static int countXs(String str) {
        int numberOfXs = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);
            if (currentCharacter == 'x' || currentCharacter == 'X') {
                numberOfXs++;
            }
        }
        return numberOfXs;
    }

    public static int countOs(String str) {
        int numberOfOs = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);
            if (currentCharacter == 'o' || currentCharacter == 'O') {
                numberOfOs++;
            }
        }
        return numberOfOs;
    }

    public static boolean getXO(String str) {
        int numberOfXs = countXs(str);
        int numberOfOs = countOs(str);

        if (numberOfXs == numberOfOs) {
            return true;
        }
        return false;
    }
}

