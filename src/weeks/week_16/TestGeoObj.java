package weeks.week_16;

public class TestGeoObj {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        Rectangle r = new Rectangle(2,8);
        Square s = new Square(4);

        GeometricObject g = new Circle(5);
        System.out.println("Circle area :" + c.getArea());
        System.out.println("Rectangle area :" + r.getArea());
        System.out.println("Square area :" + s.getArea());
        System.out.println("Are the square's area and rectangle's area the same:" + hasEqualArea(s,c));
    }

    private static boolean hasEqualArea(GeometricObject o1, GeometricObject o2){
        return o1.getArea()== o2.getArea();
    }

}
