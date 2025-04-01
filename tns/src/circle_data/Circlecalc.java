package circle_data;
import java.util.Scanner;
class Circle {
    private double radius;
    private String color;

    // Method to accept details of the circle
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
        System.out.print("Enter the color of the circle: ");
        color = scanner.next();
        scanner.close();
    }

    // Method to calculate the area of the circle
    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
        System.out.println("Area: " + area);
    }
}
public class Circlecalc {
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle();

        // Call the getInput method
        circle.getInput();

        // Call the calcArea method
        circle.calcArea();
    }
}
