public class VolumeOfCylinder {
    public static void main(String[] args) {
        double radius = 5.0; 
        double height = 10.0; 
        double pi = Math.PI; 
        double volume = pi * Math.pow(radius, 2) * height;

        System.out.println("The volume of the cylinder is: " + volume);
    }
}