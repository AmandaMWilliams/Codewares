package HackerrankEasy;

import java.io.*;

//Given the sequence of up and down steps during a hike, find and print
// the number of valleys walked through. A valley is a sequence of
// consecutive steps below sea level, starting with a step down from sea
// level and ending with a step up to sea level.

public class CountingValleys {
    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        int numberOfValleys = 0;
        int elevation = 0;

        if (steps > 0) {
            for (int i = 0; i < steps; i++) {
                if (elevation == 0 && path.charAt(i) == 'D'){
                    elevation--;
                    numberOfValleys++;
                } else if (elevation == 0 && path.charAt(i) == 'U'){
                    elevation++;
                } else if (elevation < 0 && path.charAt(i) == 'D'){
                    elevation--;
                } else if (elevation < 0 && path.charAt(i) == 'U'){
                    elevation++;
                } else if (elevation > 0 && path.charAt(i) == 'D'){
                    elevation--;
                } else {
                    elevation++;
                }
            }
        }
        return numberOfValleys;
    }


    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int steps = Integer.parseInt(bufferedReader.readLine().trim());

            String path = bufferedReader.readLine();

            int result = CountingValleys.countingValleys(steps, path);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
