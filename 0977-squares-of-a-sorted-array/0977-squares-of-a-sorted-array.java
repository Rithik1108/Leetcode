class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;
        int k = n - 1;

        while (left <= right) {

            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[k] = nums[left] * nums[left];
                k--;
                left++;
            } else {
                ans[k] = nums[right] * nums[right];
                k--;
                right--;
            }
        }

        return ans;
    }
}