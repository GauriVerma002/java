public class VolumeOfCone {
    public static void main(String[] args) {
       
        double radius = 5.0;
        double height = 10.0; 
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;

        System.out.println("The volume of the cone is: " + volume);
    }
}