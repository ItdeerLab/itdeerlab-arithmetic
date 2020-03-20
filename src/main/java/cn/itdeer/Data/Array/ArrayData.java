package cn.itdeer.Data.Array;

import java.util.Random;

/**
 * 数组数据获取
 */
public class ArrayData {

    /**
     * 获取一个有序的整型数组
     *
     * @return 返回一个长度为10000的整型数组
     */
    public static int[] getOrderArray() {
        int number = 10000;
        return getOrderArray(number);
    }


    /**
     * 获取一个指定长度有序的整型数组
     *
     * @param number 数组长度
     * @return 指定长度数组
     */
    public static int[] getOrderArray(int number) {
        int left = 0;
        return getOrderArray(number, left);
    }

    /**
     * 获取一个指定长度有序和左边界的整型数组
     *
     * @param number 数组长度
     * @param left   左边界
     * @return 指定长度及左边界的数组
     */
    public static int[] getOrderArray(int number, int left) {

        if (number <= 0)
            throw new RuntimeException("数组长度需大于0");

        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = left++;
        }
        return array;
    }


    /**
     * 获取一个随机的无序整型数组
     *
     * @return 返回一个长度为10000的整型数组
     */
    public static int[] getRandomArray() {
        int number = 10000;
        return getRandomArray(number);
    }

    /**
     * 获取一个指定长度的随机无序整型数组
     *
     * @param number 数组长度
     * @return 返回一个指定长度，左边界为0，右边界为数组长度的数组
     */
    public static int[] getRandomArray(int number) {
        int left = 0;
        return getRandomArray(number, left, number);
    }

    /**
     * 获取一个指定长度和边界的随机无序整型数组
     *
     * @param number 数组长度
     * @param left   左边界
     * @param right  右边界
     * @return 返回一个指定长度和边界的整型数组
     */
    public static int[] getRandomArray(int number, int left, int right) {

        if (number <= 0)
            throw new RuntimeException("数组长度需大于0");
        if (right < left)
            throw new RuntimeException("右边界需大于等于左边界");

        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = new Random().nextInt(right - left + 1) + left;
        }

        return array;
    }


    /**
     * 获取一个近似有序的整型数组
     *
     * @return 返回一个长度为10000的整型数组
     */
    public static int[] getNearOrderArray() {
        int number = 10000;
        return getNearOrderArray(number);
    }


    /**
     * 获取一个指定长度的近似有序整型数组
     *
     * @param number 数组长度
     * @return 指定长度数组
     */
    public static int[] getNearOrderArray(int number) {
        int left = 0;
        int disorder = 10;
        return getNearOrderArray(number, left, disorder);
    }


    /**
     * 获取一个指定长度的近似有序整型数组
     *
     * @param number 数组长度
     * @param left   左边界
     * @return 指定长度数组
     */
    public static int[] getNearOrderArray(int number, int left) {
        int disorder = 10;
        return getNearOrderArray(number, left, disorder);
    }

    /**
     * 获取一个指定长度近似有序和左边界的整型数组
     *
     * @param number   数组长度
     * @param left     左边界
     * @param disorder 无序的对数
     * @return 指定长度及左边界的数组
     */
    public static int[] getNearOrderArray(int number, int left, int disorder) {

        if (number <= 0)
            throw new RuntimeException("数组长度需大于0");

        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = left++;
        }

        for (int i = 0; i < disorder; i++) {

            int l = new Random().nextInt(number + 1);
            int r = new Random().nextInt(number + 1);

            int tmp = array[l];
            array[l] = array[r];
            array[r] = tmp;
        }

        return array;
    }


}
