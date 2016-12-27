package org.calvin.Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithDuplicates {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // IMPORTANT FOR DUPE DETECTION
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        int begin = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 0 || nums[i] != nums[i - 1]) begin = 0;
            int size = result.size();
            for(int j = begin; j < size; j++){
                List<Integer> cur = new ArrayList<Integer>(result.get(j));
                cur.add(nums[i]);
                result.add(cur);
            }
            begin = size;
        }
        return result;
    }
}