class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int minProduct = nums[0];
        int best = nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=best*nums[i];
            int v3=minProduct*nums[i];
            best = Math.max(v3,Math.max(v1,v2));
            minProduct = Math.min(v3,Math.min(v2,v1));
            max = Math.max(max,best);
        }
        return max;
    }
}