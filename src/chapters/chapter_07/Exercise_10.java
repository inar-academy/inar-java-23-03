package chapters.chapter_07;

import weeks.week_09.binarySearch.BinarySearch;
import weeks.week_10.Student;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise_10 {
    /*
    (Find the index of the smallest element) Write a method that returns the index of the smallest
    element in an array of integers.

    [6,2,7,4] => 1


     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the array :");
        int l = input.nextInt();

        int[] arr = new int[l];
        //static methods are being invoked through Classes
        Math.random();

        BinarySearch.fillArrWithRandomValues(arr, 0, 100);
        int indexOfMinValue = indexOfSmallestElement(arr);
        BinarySearch.printArr(arr);

        if (arr.length > 0) {
            System.out.printf("The minimum value is %d, the index of this number is %d\n", arr[indexOfMinValue], indexOfMinValue);
        }
        System.out.println("MAX + 1 " + (Integer.MAX_VALUE));
        System.out.println("MIN - 1 " + (Integer.MIN_VALUE));

        System.out.println(Math.pow(2, 31));


//        //non-static can only be invoked via object
//        String s = new String("");
//        s.length();
//
//        BinarySearch b = new BinarySearch();
//        b.nonStaticMethod();

//        Student haluk = new Student();
//        haluk.changeEmail("haluk@inar.com");
    }

    //5,12 ,7, 5, 8
    public static int indexOfSmallestElement(int[] array) {
        int minIndex = -1;  //0
        int minVal = Integer.MAX_VALUE; // 10
        //{19,15,16,18}
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= minVal) {
                minIndex = i;
                minVal = array[i];
            }
        }
        return minIndex;
    }
}
