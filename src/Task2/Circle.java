package Task2;

public class Circle {
    private double radius;

    public void setRadius(double radius) throws NegativeNumberException {
        if (radius < 0) {
            throw new NegativeNumberException("Radius cannot be under 0");
        }
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
