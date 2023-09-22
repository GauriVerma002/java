public class AreaOfIsosceles {
    static float find_Area_of_Isosceles_Triangle(float h, float b) {
        float Area_of_Isosceles_Triangle;
        Area_of_Isosceles_Triangle = (1 * b * h) / 2; 
        return (Area_of_Isosceles_Triangle);
    }

    public static void main(String[] args) {
        float h = 5;
        float base = 10;
        System.out.println("The Area of Isosceles Triangle in Java:");
        System.out.println(find_Area_of_Isosceles_Triangle(h, base));
    }
}