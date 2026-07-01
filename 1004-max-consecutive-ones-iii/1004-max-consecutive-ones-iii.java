class Solution {
    public int longestOnes(int[] nums, int k) {
        int[] arr = new int[2];
        int low=0,res=0;
        for(int high=0;high<nums.length;high++){
            int n = nums[high];
            arr[n]++;
            int len = high-low+1;
            int diff = len-arr[1];
            while(diff>k){
                int ln=nums[low];
                arr[ln]--;
                low++;
                len=high-low+1;
                diff=len-arr[1];
            }
            res = Math.max(res,len);
        } 
        return res;
    }
}