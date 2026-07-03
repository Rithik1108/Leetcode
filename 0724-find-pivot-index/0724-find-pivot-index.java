class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int sum = 0;
        for(int x : nums){
            sum = sum + x;
        }
        for(int i=0;i<nums.length;i++){
            int right = sum-nums[i]-left;
            if(left==right){
                return i;
            }
            left = left+nums[i];
        }
        return -1;
    }
}