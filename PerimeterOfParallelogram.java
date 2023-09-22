import java.util.Scanner;

public class PerimeterOfParallelogram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length: ");
		double length = sc.nextDouble();
		System.out.print("Enter the Breadth: ");
		double breadth = sc.nextDouble();
		sc.close();
		double perimeter = 2 * (length + breadth);
		System.out.println("Perimeter: " + perimeter);
	}
}  