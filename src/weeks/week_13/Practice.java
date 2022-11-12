package weeks.week_13;

import java.math.BigInteger;

public class Practice {

    public static void main(String[] args) {
        //Wrapper Class
        Integer sayi1 = new Integer(34);
        Integer sayi2 = new Integer(34);

        //Has Relationship - Is RelationShip
        System.out.println(sayi2 + sayi1);

        //Stringbuilder
        String a = "Tarik";
        String b ="Tarik";

        System.out.println();

        //String Immutable class
        String c = "Tarik";
        System.out.println();
        c = "Inar";
        System.out.println();

        StringBuilder sb1 = new StringBuilder("Tarik");
        sb1.append(" Inar");

        String s1 = "Tarik";
        s1 += " Inar";

        //Time Complexity - Space Complexity
        System.out.println(sb1.toString());
        System.out.println(s1);

        Integer int1 = (Integer) 5;


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE +1);

        BigInteger max= new BigInteger(String.valueOf(2147483647));
        System.out.println(max);
        BigInteger bir = new BigInteger("1");
        max = max.add(bir);
        System.out.println(max);
        max = max.multiply(max);
        System.out.println(max);

    }
}
