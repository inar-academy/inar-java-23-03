package weeks.week_07;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        System.out.println("Please enter a number to verify if it is a prime number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean isPrimeNumber = isPrime(num);
        System.out.println("is " + num + " prime number?");
        System.out.println(isPrimeNumber);
    }

    public static boolean isPrime(int num){//5
        if(num < 2){
            return false;
        }
        for (int i = 2; i < num ; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
