import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sumOfDivisors = 1; 
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
                if (i != num / i) {
                    sumOfDivisors += num / i;
                }
            }
        }

        return sumOfDivisors == num;
    }
}

