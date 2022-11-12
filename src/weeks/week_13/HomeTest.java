package weeks.week_13;

public class HomeTest {

    public static void main(String[] args) {
        Home texasEvi = new Home();
        texasEvi.print();

        texasEvi.setCephesi("anya mi konya mi");
        texasEvi.print();

        System.out.println("$$$$$$$$$$$");
        Home redmondEv = new Home(300,7,4,true,1_000_000,7000,"dort cephe", 1960);
        redmondEv.print();
        redmondEv.renovasyon();
        redmondEv.print();

        //Encapsulation - Kapsul : In Java encapsulation is handled through classes, in which the class works as a blueprint to objects
        // public, private, protected, , -> encapsulation the data fields, methods, class

        //Abstraction - Soyutlama :
        redmondEv.print();
        Math.random();

        //Inheritance

        //Polymorphism

    }
}


