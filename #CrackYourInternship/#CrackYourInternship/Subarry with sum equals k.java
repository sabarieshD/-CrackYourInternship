class Solution {
    public int subarraySum(int[] nums, int k) {
       Map<Integer,Integer> mp = new HashMap<>();
       int n = nums.length;
       int presum = 0, count = 0;
       mp.put(0,1);
       for(int i=0; i<n; i++){
        presum+=nums[i];
        int removal = presum - k;
        if(mp.containsKey(removal)){
            count += mp.get(removal);
        }
        mp.put(presum, mp.getOrDefault(presum, 0)+1);
       }return count;
    }
}