import java.util.Scanner;

public class DecToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();

        String binaryNumber = convertDecimalToBinary(decimalNumber);

        System.out.println("Binary equivalent: " + binaryNumber);
    }

    // Function to convert decimal to binary
    public static String convertDecimalToBinary(int decimal) {
        StringBuilder binaryNumber = new StringBuilder();
        
        // Special case for 0
        if (decimal == 0) {
            return "0";
        }

        while (decimal > 0) {
            int remainder = decimal % 2;
            binaryNumber.insert(0, remainder); // Insert at the beginning
            decimal /= 2;
        }

        return binaryNumber.toString();
    }
}
 
