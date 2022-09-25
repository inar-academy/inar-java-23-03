package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_05_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers:");
        /* 2 yerde verilen sayilar kullaniliyor
            - Aritmetik Toplam
            - Kareleri Toplam
         */
        //1 2 3 ...
        double sum = 0;//1 + 2
        double squareSum = 0;// 1 + 2^2

        for (int i = 0; i < 10 ; i++) {
            double temp = input.nextDouble();
            sum += temp;
            squareSum += (temp*temp);
        }

        double mean = sum / 10.0;
        double sDeviation = Math.sqrt( ((squareSum) - ((sum * sum)/10.0))  / 9.0 );
        System.out.printf("The mean is %f\n",mean);
        System.out.printf("The standard deviation is %f\n",sDeviation);

    }
}
