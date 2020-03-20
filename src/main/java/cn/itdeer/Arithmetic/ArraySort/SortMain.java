package cn.itdeer.Arithmetic.ArraySort;

import cn.itdeer.Data.Array.ArrayData;

/**
 * 排序算法测试
 */
public class SortMain {

    public static void main(String[] args) {

        int[] array1 = ArrayData.getNearOrderArray();
        int[] array2 = ArrayData.copyArray(array1);

        long start = System.currentTimeMillis();
        SelectSort.sort(array1);
        long end = System.currentTimeMillis();
        Boolean status = ArrayData.checkArray(array1);
        System.out.println("正确性：" + status + " 用时：" + (end - start) / 1000.0 + "s");


        start = System.currentTimeMillis();
        InsertSort.sort2(array2);
        end = System.currentTimeMillis();
        status = ArrayData.checkArray(array2);
        System.out.println("正确性：" + status + " 用时：" + (end - start) / 1000.0 + "s");
    }

}
