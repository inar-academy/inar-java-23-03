package weeks.week_07;

//5
//04:59


import java.util.Scanner;

public class Sayac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter minutes of break: ");
        int m = input.nextInt();
        int s = m * 60;

        for (int i = s; i > 0 ; i--) {
            int minute = i/60;
            int second = i %60;
            String min = minute < 10 ? "0"+ minute : ""+minute;
            String sec = second < 10 ? "0"+ second : ""+second;
            System.out.printf("%s:%s\n",min,sec);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("   SURE BITTI   ");
        System.out.println("----------------");
        System.out.println("----------------");

    }
}
