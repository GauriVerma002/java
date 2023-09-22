import java.util.Scanner;

public class FahToCel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        scanner.close();

        double celsius = convertFahrenheitToCelsius(fahrenheit);

        System.out.println("Temperature in Celsius: " + celsius + " °C");
    }

    // Function to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

