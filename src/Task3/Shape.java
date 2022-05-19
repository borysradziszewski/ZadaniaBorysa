package Task3;

abstract class Shape {
    protected String color;
    protected boolean isFilled;


    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract float getArea();

    public abstract float getPerimeter();


    @Override
    public String toString() {
        return String.format("Shape with color of %s and %s", color, isFilled ? "filled" : "NotFilled");
    }
}
