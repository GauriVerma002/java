
  
class PerimeterOfCircle
{
    static float area_equi_triangle(float side)
    {
  
        return (float)(((Math.sqrt(3)) / 4) *
                        side * side);
    }
    static float peri_equi_triangle(float side)
    {
        return 3 * side;
    }
    public static void main(String arg[])
    {
        float side = 4;
        System.out.print("Area of Equilateral Triangle:");
        System.out.println(area_equi_triangle(side));
        System.out.print("Perimeter of Equilateral Triangle:");
        System.out.println(peri_equi_triangle(side));
    }
}
  