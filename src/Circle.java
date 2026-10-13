    public class Circle {
    private double radius = 1.0;
    private String color = "blue";

    // Constructor with default radius and colour
    public Circle() {
    }

    // Constructor with given radius, default colour
    public Circle(double r) {
        radius = r;
    }

    // Constructor with given radius and colour
    public Circle(double r, String colour) {
        radius = r;
        color = colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return color;
    }

    public void setColour(String colour) {
        color = colour;
    }

    // A public method for computing the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }


}
