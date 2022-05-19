package Task5;

public class Circle implements GeometricObject{

    protected double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double Permieter = 2 * Math.PI * radius;
        return Permieter;
    }

    @Override
    public double getArea() {
        double Area = Math.PI * Math.pow(radius, 2);
        return Area;
    }


}
