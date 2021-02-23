import java.util.Scanner;

public class BinaryConverter {
    public static class Converter {
        public static String toBinary(Integer givenInteger){
            String binary = "";
            while(givenInteger > 0) {
                binary = (givenInteger % 2) + binary;
                givenInteger /= 2;
            }
            return binary;
        }
    }


    public class Program {
        public void main(String[ ] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.print(Converter.toBinary(x));
        }
    }
}
