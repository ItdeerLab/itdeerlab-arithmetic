package cn.itdeer.Arithmetic.BinarySearch;

import cn.itdeer.Data.Array.ArrayData;


public class Version2 {

    public static void main(String[] args) {

        int number = 10000000;
        int[] array = ArrayData.getOrderArray(number);

        long start = System.currentTimeMillis();

        for (int i = 0; i < number; i++) {
            if (i != binarySearch(array, i))
                throw new RuntimeException("查找错误");
        }

        long end = System.currentTimeMillis();

        System.out.println("Times:\t" + (end - start) / 1000 + "s");
    }

    /**
     * 二分查找
     *
     * @param array  数组
     * @param target 查找目标
     * @return 查找值
     */
    private static int binarySearch(int[] array, int target) {
        int number = array.length;

        int l = 0, r = number - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (array[mid] == target)
                return mid;
            if (array[mid] > target)
                r = mid - 1;
            if (array[mid] < target)
                l = mid + 1;
        }
        return -1;
    }

}
