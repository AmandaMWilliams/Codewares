package Level6;


// Given a positive integer n written as abcd... (a, b, c, d... being
// digits) and a positive integer p find a positive integer k, if it
// exists, such as the sum of the digits of n taken to the successive
// powers of p is equal to k * n. If it is the case we will return k, if
// not return -1.

public class DigPow {
    public static long digPow(int n, int p) {
        String nAsAString = String.valueOf(n);
        long sumOfN = 0L;
        long k = -1;
        for (int i = 0; i < nAsAString.length(); i++) {
            String currentValue = nAsAString.substring(i, i + 1);
            long individualDigit = Integer.parseInt(currentValue);
            long raisedToP = (long) Math.pow(individualDigit, p);
            p++;
            sumOfN += raisedToP;
            k = sumOfN / n;
            if (sumOfN % n != 0) {
                k = -1;
            }
        }
        return k;
    }
}
