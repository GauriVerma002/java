
public class Weighted{
    public static void main(String[] args) {
        double[] values = { 80, 90, 75, 60 }; 
        double[] weights = { 0.2, 0.3, 0.25, 0.25 }; 

        if (values.length != weights.length) {
            System.out.println("The number of values and weights should be the same.");
            return;
        }
        double sumOfProducts = 0.0;
        double sumOfWeights = 0.0;

        for (int i = 0; i < values.length; i++) {
            sumOfProducts += values[i] * weights[i];
            sumOfWeights += weights[i];
        }

        double weightedAverage = sumOfProducts / sumOfWeights;

        System.out.println("The weighted average is: " + weightedAverage);
    }
}
