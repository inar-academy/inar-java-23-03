package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_05_17 {
    public static void main(String[] args) {
        System.out.print("Enter the number of lines: ");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();

        for (int satir = 1; satir <= sayi; satir++) {
            firstLoop(sayi, satir);
            secondLoop(sayi, satir);
            if(satir >= 2){
                thirdLoop(sayi, satir);
            }
            System.out.println();
        }
    }

    public static void thirdLoop(int sayi, int satir){
        for (int sutun = 2; sutun <= satir ; sutun++) {
            System.out.printf("%3d",sutun);
        }
    }

    public static void secondLoop(int sayi, int satir) {
        for (int sutun = satir; sutun >= 1; sutun--) {
            System.out.printf("%3d",sutun);
        }
    }

    public static void firstLoop(int sayi, int satir) {
        for (int sutun = sayi - satir; sutun > 0; sutun--) {
            System.out.print("   ");
        }
    }


}
