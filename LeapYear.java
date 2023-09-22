import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        scanner.close();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4, except for years divisible by 100 but not by 400.
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
