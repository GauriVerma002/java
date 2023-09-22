public class AreaOfRhombus {
    public static void main(String[] args)
    {
        double d1, d2;
        d1 = 2;
        d2 = 3;
        if (d1 <= 0 || d2 <= 0)
            System.out.println("Length should be positive");
        else
            System.out.println("Area of rhombus = "
                               + (d1 * d2) / 2);
    }
}
