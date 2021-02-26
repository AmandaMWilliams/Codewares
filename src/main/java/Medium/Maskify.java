package Medium;

public class Maskify {

    public static String maskify(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.length() > 4 && i < str.length() - 4) {
                result += "#";
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
