package weeks.week_09.selectionSort;

import weeks.week_09.binarySearch.BinarySearch;

import java.util.Arrays;

public class SelectionSortBook {
    public static void main(String[] args) {
        int[] arr = new int[10];
        BinarySearch.fillArrWithRandomValues(arr, 0, 20);
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------");
        selectionSort(arr);
        System.out.println("BOOK :" + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("JAVA :" + Arrays.toString(arr));
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
