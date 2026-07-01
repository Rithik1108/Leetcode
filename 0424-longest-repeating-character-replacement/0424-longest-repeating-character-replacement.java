class Solution {
    public int max(int[] arr){
        int count =0;
        for(int i=0;i<arr.length;i++){
            count = Math.max(count,arr[i]);
        }
        return count;
    }
    public int characterReplacement(String s, int k) {
        int[] arr =  new int[256];
        int low=0,res=Integer.MIN_VALUE;
        for(int high=0;high<s.length();high++){
            char hCh = s.charAt(high);
            arr[hCh]++;
            int len = high-low+1;
            int maxInt = max(arr);
            int diff = len-maxInt;
            while(diff>k){
                char lCh = s.charAt(low);
                arr[lCh]--;
                low++;
                maxInt = max(arr);
                len = high-low+1;
                diff = len-maxInt;
            }
            len = high-low+1;
            res = Math.max(res,len);
        }
        return res;
    }
}