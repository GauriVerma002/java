
import java.text.DecimalFormat;
 
public class DiscountOfProduct {
    public static String discountPercentage(double M, double S)
    {
        double fraction = S / M;
        double discountFraction = 1 - fraction;
        double percentage = discountFraction * 100;
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(percentage) + "%";
    } 
    public static void main(String[] args)
    {
        double M = 120;
        double S = 100;
        System.out.println(discountPercentage(M, S));
    }
}
