package cn.itdeer.Data;

import cn.itdeer.Data.Array.ArrayData;
import org.junit.Test;

public class PrintDataTest {

    @Test
    public void printArrayData() {
        int[] array = ArrayData.getOrderArray(10);
        PrintData.printArrayData(array);
    }
}