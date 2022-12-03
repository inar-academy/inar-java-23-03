package weeks.week_16;

public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

   public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
}
