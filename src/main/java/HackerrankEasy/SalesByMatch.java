package HackerrankEasy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


// There is a large pile of socks that must be paired by color. Given
// an array of integers representing the color of each sock, determine
// how many pairs of socks with matching colors there are.


public class SalesByMatch {

    public static int sockMerchant(int numberOfSocks, int[] colorsOfEachSock) {
        int numberOfPairs= 0;

        for (int i = 0; i < numberOfSocks; i++) {
            if(colorsOfEachSock[i] != 0) {
                for (int j = i + 1; j < numberOfSocks; j++) {
                    if (colorsOfEachSock[i] == colorsOfEachSock[j]) {
                        numberOfPairs++;
                        colorsOfEachSock[j] = 0; //set j = 0 so it
                        // cannot be counted again b/c of line 22
                        break;
                    }
                }
            }
        }
        return numberOfPairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
