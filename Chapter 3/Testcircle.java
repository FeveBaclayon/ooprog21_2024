public class TestCircle {
    public static void main(String[] args) {
        // Create Circle objects
        Circle a = new Circle();
        Circle b = new Circle();
        Circle c = new Circle();

        // Set radius for the first circle and print its details
        a.setRadius(3);
        System.out.println("Circle A - Radius: " + a.getRadius());
        System.out.println("Circle A - Diameter: " + a.getDiameter());
        System.out.println("Circle A - Area: " + a.getArea());

        // Set radius for the second circle and print its details
        b.setRadius(20);
        System.out.println("Circle B - Radius: " + b.getRadius());
        System.out.println("Circle B - Diameter: " + b.getDiameter());
        System.out.println("Circle B - Area: " + b.getArea());
    }
} 
