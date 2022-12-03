package weeks.week_16;

// if you would like to create a concrete class, then you
// must implement all the abstract methods prior

public abstract class Cizgi extends GeometricObject{
    private double length;

    public double getPerimeter(){
        return this.length;
    }

    public abstract void yazdir();
}
