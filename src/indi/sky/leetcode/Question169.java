package indi.sky.leetcode;

import java.util.HashMap;

/**
 * 169. 求众数
 */
public class Question169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int res = 0;
        int count = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key)>count){
                res = key;
                count = map.get(key);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Question169 q = new Question169();
        q.majorityElement(new int[]{3, 4, 3});
//        q.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
    }
}
