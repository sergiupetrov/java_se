import java.awt.*;

public class Circle extends Shape {
    private Point point;
    private double radius;

    Circle(Point center, double radius) {
        this.point = center;
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void move()

}