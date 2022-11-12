package weeks.week_13;

public class Car {
    private String model;
    private String make;
    private int year;
    private double price;
    private boolean hasAccident;

    public Car(String model, String make, int year, double price, boolean hasAccident) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.price = price;
        this.hasAccident = hasAccident;
    }

    public Car() {
        this("default","default",0,0,false);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasAccident() {
        return hasAccident;
    }

    public void setHasAccident(boolean hasAccident) {
        this.hasAccident = hasAccident;
    }
}
