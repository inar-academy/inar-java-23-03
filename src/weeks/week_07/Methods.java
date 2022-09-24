package weeks.week_07;

import java.util.Locale;

public class Methods {


    public static void main(String[] args) {
        int a = 20;
        a = sayiyi2ileCarp(a);
        System.out.println(a);

    }


    public static int sayiyi2ileCarp(int b){
        b = 2 * b;
        return b;
    }








    // String i parametre olarak alan metod,
    // verilen degerin ortadaki karakterini dondursun
    // tarik =>
    public static char ortaKarakteriGetir(String word){
        int l = word.length();
        int m = l /2 ;
        char c = word.charAt(m);
        return c;
    }















    public static int sayi5Getir() {
        return 5;
    }


    public static int toplam(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static String isimGetir() {
        String d = "deneme";
        d.charAt(5);
        d.isEmpty();
        d.length();
        Math.random();
        d = d.toUpperCase(Locale.ROOT);
        d = "inar";
        return d;
    }


    public static void sayi5() {

    }


    public static void yazdir(int num) {
        System.out.println(num);
    }


    public static int random(int num) {
        int a = (int) (Math.random() * num);
        return a;
    }

    public void nonStaticMetodum() {
        System.out.println("Bu bir non-static method");
    }

    private static void privateMethod() {
    }
}