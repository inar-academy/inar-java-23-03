package weeks.week_07;

public class TumAsalSayilariBul {
    public static void main(String[] args) {
        findThePrimeNumbersUntil(100);
    }

    public static void findThePrimeNumbersUntil(int a){
        for (int i = 0; i < a; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
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
