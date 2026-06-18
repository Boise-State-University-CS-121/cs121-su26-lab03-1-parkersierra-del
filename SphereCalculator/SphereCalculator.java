public class SphereCalculator {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int radiusSphere;
        double volumeSphere;
        double surfaeAreaSphere;

        // Prompt for radius
        System.out.print("Enter the sphere's radius; ");
        double radius = in.next.Double();

        // Caculate volume: (4/3) * pi * r^3
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Calculate surface area: 4 * pi * r^2
        double surfaceArea = 4.0 * Math.PI * Math.pow(radius, 2);

        // Print output to four decimal places
        System.out.printf("Volume: %.4f/n", volume);
        System.out.printf("Surface area: %.4f/n", surfaceArea)

        in.close();
    }
}
    
