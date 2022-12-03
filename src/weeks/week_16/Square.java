package weeks.week_16;

public class Square extends GeometricObject{

    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return Math.pow(this.length,2);
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }
}
