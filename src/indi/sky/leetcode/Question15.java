package indi.sky.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 */
public class Question15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<int[]> l = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                int sum2 = nums[i] + nums[j];
            }
        }

        return list;
    }

    public static void main(String[] args){
        Question15 quertion = new Question15();
        int[] num = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list = quertion.threeSum(num);
        System.out.println("结果:"+list);
    }
}

