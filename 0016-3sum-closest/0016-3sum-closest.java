class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest = nums[0]+nums[1]+nums[2];
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                int temp = Math.abs(sum-target);
                if(sum<target){
                    if(temp<Math.abs(closest-target)){
                        closest = sum;
                    }
                    j++;
                }
                else{
                    if(temp<Math.abs(closest-target)){
                        closest = sum;
                    }
                    k--;
                }
            }
        }
        return closest;
    }
}