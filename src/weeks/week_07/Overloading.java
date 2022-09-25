package weeks.week_07;

public class Overloading {

    public static void main(String[] args) {
//        System.out.println(sum(4.0,5));
//          abstract, black box
//        Math.sqrt(4);
        int a = 20;
        doubleTheNume(a);
        System.out.println(a);

        String s = "tarik";
        changeCharacter(s);
        System.out.println(s);
        if(true){
            int temp = 0;
        }
        int temp = 5;
    }

     static void changeCharacter(String b) {
        b = b + " Inar ";
        int temp;
    }













    static void doubleTheNume(int a){
        a = a * 2;
    }


    public static int sum(int num1, int num2){
        return num1 + num2;
    }


    public static int sum(double num1, int num2){
        return (int)(num1 + num2);
    }




}
