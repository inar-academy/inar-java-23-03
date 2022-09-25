package weeks.week_07;

public class BitwiseOperations {
    public static void main(String[] args) {
//        int a = 9;
//        int b = 5;
////        andOperator(a,b);
//        inclusiveOr(a,b);
//        exclusiveOr(a,b);
        int d = 7 >>1;
        System.out.println(d);

    }

    private static void exclusiveOr(int a, int b) {
        System.out.println(a ^ b);
    }

    private static void inclusiveOr(int a, int b) {
        int c = a | b;
        System.out.println(c);
    }

    private static void andOperator(int a, int b) {
        int c = a & b;
        System.out.println(c);
    }
}
