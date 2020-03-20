package cn.itdeer.Arithmetic.ArraySort;

import cn.itdeer.Data.Array.ArrayData;
import cn.itdeer.Data.PrintData;

/**
 * 选择排序
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] array = ArrayData.getRandomArray(20);
        PrintData.printArrayData(array);
        sort(array);
        PrintData.printArrayData(array);
    }


    public static void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    public static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

}
