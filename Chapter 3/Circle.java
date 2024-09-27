public class Circle {
    // Static variables for radius, diameter, and area
    private static double radius;
    private static double diameter;
    private static double area;

    // Constructor that initializes radius to 1, and calculates diameter and area
    public Circle() {
        radius = 1;
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

    // Method to set the radius, and recalculate diameter and area
    public static void setRadius(double rad) {
        radius = rad;
        diameter = 2 * radius;
        area = Math.PI * radius * radius; // Directly squaring radius without Math.pow
    }

    // Getter method for radius
    public static double getRadius() {
        return radius;
    }

    // Getter method for diameter
    public static double getDiameter() {
        return diameter;
    }

    // Getter method for area
    public static double getArea() {
        return area;
    }
} 
