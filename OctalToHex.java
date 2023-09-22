import java.util.Scanner;

public class OctalToHex{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalNumber = scanner.next();
        scanner.close();

        // Step 1: Convert octal to decimal
        int decimalNumber = convertOctalToDecimal(octalNumber);

        // Step 2: Convert decimal to hexadecimal
        String hexadecimalNumber = convertDecimalToHexadecimal(decimalNumber);

        System.out.println("Hexadecimal equivalent: " + hexadecimalNumber);
    }

    // Function to convert octal to decimal
    public static int convertOctalToDecimal(String octal) {
        int decimalNumber = 0;
        int length = octal.length();

        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(octal.charAt(i));
            decimalNumber += digit * Math.pow(8, length - i - 1);
        }

        return decimalNumber;
    }

    // Function to convert decimal to hexadecimal
    public static String convertDecimalToHexadecimal(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }
}

