import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = res[1] = -1;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int req = target - nums[i];
            if(mp.containsKey(req)){
                res[0] = mp.get(req);
                res[1] = i;
                return res;
            }
            mp.put(nums[i], i);
        }return res;
    }
}