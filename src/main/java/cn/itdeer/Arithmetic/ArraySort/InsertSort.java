package cn.itdeer.Arithmetic.ArraySort;

import cn.itdeer.Data.Array.ArrayData;
import cn.itdeer.Data.PrintData;

/**
 * 插入排序
 */
public class InsertSort {

    public static void main(String[] args) {

        int[] array = ArrayData.getRandomArray(20);
        PrintData.printArrayData(array);
        sort2(array);
        PrintData.printArrayData(array);
    }


    public static void sort1(int[] array) {

        int n = array.length;

        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j - 1, j);
                }
            }
        }
    }

    public static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }


    public static void sort2(int[] array) {

        for (int i = 1; i < array.length; i++) {

            int e = array[i];
            int j;

            for (j = i; j > 0 && array[j - 1] > e; j--) {
                array[j] = array[j - 1];
            }

            array[j] = e;
        }
    }

}
