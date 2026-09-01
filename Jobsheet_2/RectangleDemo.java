package Jobsheet_2;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        rect.length = 10;
        rect.width = 5;

        System.out.println("=== Rectangle Data ===");
        rect.displayInfo();

        System.out.println("Area          : " + rect.getArea());
        System.out.println("Circumference : " + rect.getCircumference());
    }
}