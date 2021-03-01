// Given two integers a and b, which can be positive or negative, find
// the sum of all the integers between including them too and return it. If the two numbers are equal return a or b.

public class SumOfNumbers {
    public int GetSum(int a, int b) {
        int result = 0;
        if (a == b) {
            result = a;
        } else if (a < b) {
            result = a;
            while (result <= b) {
                result += result +1;
            }
        } else if (b < a){
            result = b;
            while (result <= a) {
                result += result +1;
            }
        } return result;
    }
}
