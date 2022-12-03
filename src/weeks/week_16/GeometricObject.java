package weeks.week_16;

// 1 - Abstract classes cannot be instantiated (
//      Object cannot be created)
// 2 - Abstract class can definde abstract methods
//      as well as public methods and data fields

public abstract class GeometricObject {
    protected boolean isFilled;

    public boolean isFilled(){
        return this.isFilled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
