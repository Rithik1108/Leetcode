class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0,sum = 0;
        int res = Integer.MAX_VALUE;
        for(int high=0;high<nums.length;high++){
            sum=sum+nums[high];
            while(sum>=target){
                res = Math.min(res,high-low+1);
                sum = sum-nums[low];
                low++;
            }
        }
        if(res==Integer.MAX_VALUE) return 0;
        return res;
    }
}