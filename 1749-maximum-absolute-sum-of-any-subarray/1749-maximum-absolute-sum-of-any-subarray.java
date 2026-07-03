class Solution {
    public int maxAbsoluteSum(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int best = arr[0];
        int least = arr[0];
        for(int i=1;i<arr.length;i++){
            int v1 = arr[i];
            int v2 = best+arr[i];
            int v3 = least+arr[i];
            best = Math.max(v1,v2);
            max = Math.max(best,max);
            least = Math.min(v1,v3);
            min = Math.min(least,min);
        }
        return Math.max(Math.abs(min),Math.abs(max));
    }
}