package Level8;// Write a program that finds the summation of every number from 1 to num.
// The number will always be a positive integer greater than 0.

public class Grasshopper {
    public static int summation(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
