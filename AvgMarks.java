import java.util.Scanner;
public class AvgMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        if (numSubjects <= 0) {
            System.out.println("Number of subjects should be greater than 0.");
        }
       double totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = scanner.nextDouble();
            totalMarks += marks;
        }
        double averageMarks = totalMarks / numSubjects;

        System.out.println("Average Marks: " + averageMarks);
        scanner.close();
    }
}
