package cn.itdeer.Leet.code283;

import cn.itdeer.Data.Array.ArrayData;
import cn.itdeer.Data.PrintData;

class Solution {

    public static void main(String[] args) {

//        int[] array = new int[]{4, 0, 3, 0, 2};
        int[] array = ArrayData.getRandomArray(5);
        PrintData.printArrayData(array);

        Solution solution = new Solution();
        solution.moveZeroes5(array);
    }

    /**
     * 第一版
     *
     * @param nums
     */
    public void moveZeroes1(int[] nums) {
        int[] nonZero = new int[nums.length];

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nonZero[index++] = nums[i];
            }
        }

        for (int i = 0; i < nonZero.length; i++) {
            nums[i] = nonZero[i];
        }

        for (int i = nonZero.length; i < nums.length; i++) {
            nums[i] = 0;
        }

        PrintData.printArrayData(nums);
    }

    /**
     * 第二版
     *
     * @param nums
     */
    public void moveZeroes2(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }

        PrintData.printArrayData(nums);
    }

    /**
     * 第三版
     *
     * @param nums
     */
    public void moveZeroes3(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, index++, i);
            }
        }
        PrintData.printArrayData(nums);
    }

    /**
     * 第四版
     *
     * @param nums
     */
    public void moveZeroes4(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != index) {
                    swap(nums, index++, i);
                } else {
                    index++;
                }
            }
        }
        PrintData.printArrayData(nums);
    }

    /**
     * 第五版
     *
     * @param nums
     */
    public void moveZeroes5(int[] nums) {
        int index = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0 && index == -1) {
                index = i;
            } else if (nums[i] != 0 && index != -1) {

                int tmp = nums[index];
                nums[index++] = nums[i];
                nums[i] = tmp;
            }
        }
        PrintData.printArrayData(nums);
    }


    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
