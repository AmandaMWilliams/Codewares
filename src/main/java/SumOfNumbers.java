// Given two integers a and b, which can be positive or negative, find
// the sum of all the integers between including them too and return it. If the two numbers are equal return a or b.

public class SumOfNumbers {
    public int GetSum(int a, int b) {
        int result = 0;
        if (a == b) {
            result = a;
        } else if (a < b) {
            result = a;
            while (a <= b) {
                a++;
                result = result + a;
            }
        } else if (b < a){
            result = b;
            while (b <= a) {
                b++;
                result = result + b;
            }
        } return result;
    }
}
