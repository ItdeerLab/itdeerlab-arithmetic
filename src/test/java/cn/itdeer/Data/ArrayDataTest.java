package cn.itdeer.Data;

import cn.itdeer.Data.Array.ArrayData;
import org.junit.Test;

/**
 * 数组数据测试
 */
public class ArrayDataTest {

    @Test
    public void getOrderArray1() {
        int[] array = ArrayData.getOrderArray();
        PrintData.printArrayData(array);
    }

    @Test
    public void getOrderArray2() {
        int[] array = ArrayData.getOrderArray(100);
        PrintData.printArrayData(array);
    }

    @Test
    public void getOrderArray3() {
        int[] array = ArrayData.getOrderArray(100, 10);
        PrintData.printArrayData(array);
    }

    @Test
    public void getRandomArray1() {
        int[] array = ArrayData.getRandomArray();
        PrintData.printArrayData(array);
    }

    @Test
    public void getRandomArray2() {
        int[] array = ArrayData.getRandomArray(100);
        PrintData.printArrayData(array);
    }

    @Test
    public void getRandomArray3() {
        int[] array = ArrayData.getRandomArray(100, 100, 200);
        PrintData.printArrayData(array);
    }
}