public class Factorial {
        public static void main(String[] args) {
            int number = 5; 
            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                long factorial = calculateFactorial(number);
                System.out.println("The factorial of " + number + " is: " + factorial);
            }
        }
        public static long calculateFactorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * calculateFactorial(n - 1);
            }
        }
    }
