package cn.itdeer.Leet.code27;

import cn.itdeer.Data.PrintData;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

//        int[] array = new int[]{2, 2, 2, 2, 2, 2, 2};
        int[] array = new int[]{2, 4, 6, 3, 4, 7, 8, 5, 2};
//        int[] array = new int[]{2, 4, 6, 3, 4, 7, 8, 5, 9};
        PrintData.printArrayData(array);
        int result = solution.removeElement(array, 2);

        System.out.println(result);
        PrintData.printArrayData(array);
    }


//    public int removeElement(int[] nums, int val) {
//
//        int k = nums.length - 1;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == val && i != k) {
//
//                for (int j = k; j > i; j--) {
//                    if (nums[j] != val) {
//                        int tmp = nums[i];
//                        nums[i] = nums[j];
//                        nums[j] = tmp;
//                    }
//                }
//
//            }
//
//        }
//        return k;
//    }


    public int removeElement(int[] nums, int val) {
        int current = nums.length;   // 右指针
        int index = 0;               // 左指针

        while(index < current){
            // 把等于 val 的值移到数组的后面
            if(nums[index] == val){
                nums[index] = nums[--current];
            }else{
                index++;
            }
        }

        return current;
    }
}
