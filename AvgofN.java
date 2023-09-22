import java.util.Scanner;

public class AvgofN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values (N): ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("N should be a positive integer.");
        }
       double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter value " + i + ": ");
            double value = scanner.nextDouble();
            sum += value;
        }
        double average = sum / n;
        System.out.println("The average of " + n + " numbers is: " + average);
        scanner.close();
    }
}
