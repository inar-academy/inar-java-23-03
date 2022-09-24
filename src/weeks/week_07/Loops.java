package weeks.week_07;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int point = input.nextInt();
//        whileLoop(10);
//        doWhileLoop(10);
//        forLoop();
//        nestedForLoop();
//        breakLoop(point);
         continueLoop(point);
    }

    public static void continueLoop(int continuePoint){
        for (int i = 1; i <= 10; i++) {
            if(i == continuePoint){
                continue;//blacklist
            }
            System.out.println(i);
        }
        System.out.println("--");
    }

    public static void breakLoop(int breakPoint){
        for (int i = 1; i <= 10; i++) {
            if(i == breakPoint){
                break;
            }
            System.out.println(i);
        }
        System.out.println("--");
    }

    public static void nestedForLoop() {
        for (int satir = 1; satir <= 3; satir++) {
            for (int sutun = 1; sutun <= 3; sutun++) {
                System.out.printf("%d, %d\n", satir, sutun);
                break;
            }
            System.out.println("sutunlar bitti");
        }

    }


    public static void forLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }


    public static void whileLoop(int counter) {
        System.out.println("while");
        while (counter < 5) {
            System.out.println(counter);
            counter++;
        }
        System.out.println("---------");
    }


    public static void doWhileLoop(int counter) {
        System.out.println("Do-While");
        do {
            System.out.println(counter);
            counter++;
        } while (counter < 5);
        System.out.println("---------");
    }
}
