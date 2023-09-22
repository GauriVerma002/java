import java.util.Scanner;

public class DecToOctal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();

        String octalNumber = convertDecimalToOctal(decimalNumber);

        System.out.println("Octal equivalent: " + octalNumber);
    }

    // Function to convert decimal to octal
    public static String convertDecimalToOctal(int decimal) {
        StringBuilder octalNumber = new StringBuilder();
        
        // Special case for 0
        if (decimal == 0) {
            return "0";
        }

        while (decimal > 0) {
            int remainder = decimal % 8;
            octalNumber.insert(0, remainder); // Insert at the beginning
            decimal /= 8;
        }

        return octalNumber.toString();
    }
}

