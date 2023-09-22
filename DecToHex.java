import java.util.Scanner;

public class DecToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();

        String hexadecimalNumber = convertDecimalToHexadecimal(decimalNumber);

        System.out.println("Hexadecimal equivalent: " + hexadecimalNumber);
    }

    // Function to convert decimal to hexadecimal
    public static String convertDecimalToHexadecimal(int decimal) {
        // Using Integer.toHexString method to convert decimal to hexadecimal
        String hexadecimalNumber = Integer.toHexString(decimal).toUpperCase();

        return hexadecimalNumber;
    }
}
