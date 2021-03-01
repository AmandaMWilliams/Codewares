package Easy;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int nCounter = 0;
        int sCounter = 0;
        int eCounter = 0;
        int wCounter = 0;
        if (walk.length != 10) {
            return false;
        } else {
            for (int i = 0; i < walk.length; i++) {
                switch (walk[i]) {
                    case 'n':
                        nCounter++;
                        break;
                    case 's':
                        sCounter++;
                        break;
                    case 'e':
                        eCounter++;
                        break;
                    case 'w':
                        wCounter++;
                        break;
                }
            }
            if (nCounter == sCounter && eCounter == wCounter) {
                return true;
            }
            return false;
        }
    }
}