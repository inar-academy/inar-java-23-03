package weeks.week_15.calculator;

import java.util.Scanner;

public class CalMain {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter two values");
        Number n1 = new Number(input.nextInt());
        Number n2 = new Number(input.nextInt());
        input.nextLine();
        System.out.println("Please enter the calculation");
        String cal = input.next();
        switch (cal){
            case("sum"):
                print(Calculator.sum(n1,n2));
                break;
            case("sub"):
                print(Calculator.subtract(n1,n2));
                break;
            case("mult"):
                print(Calculator.multiply(n1,n2));
                break;
            case("mod"):
                print(Calculator.mod(n1,n2));
                break;
        }
    }

    private static void print(Number n3){
        System.out.println("After calculation the number is " + n3.getValue());
    }
}
