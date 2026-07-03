class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int best = arr[0];
        int least = arr[0];
        int sum = arr[0];
        for(int i=1;i<arr.length;i++){
            sum = sum + arr[i];
            int v1 = arr[i];
            int v2 = best+arr[i];
            int v3 = least+arr[i];
            best = Math.max(v1,v2);
            max = Math.max(best,max);
            least = Math.min(v1,v3);
            min = Math.min(least,min);
        }
        if(max<0) return max;
        return Math.max(max,sum-min);
    }
}