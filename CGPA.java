
public class CGPA {
    public static void main(String[] args) {
        double[] creditHours = { 3.0, 4.0, 3.0, 3.0 }; 
        double[] grades = { 3.7, 4.0, 3.3, 3.0 };     

        if (creditHours.length != grades.length) {
            System.out.println("The number of credit hours and grades should be the same.");
            return;
        }

        double totalCreditHours = 0;
        double sumGradePoints = 0;

        for (int i = 0; i < creditHours.length; i++) {
            double courseGradePoints = grades[i] * creditHours[i];
            totalCreditHours += creditHours[i];
            sumGradePoints += courseGradePoints;
        }
        double cgpa = sumGradePoints / totalCreditHours;
        System.out.println("Your CGPA is: " + cgpa);
    }
}
