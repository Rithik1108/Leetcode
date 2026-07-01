class Solution {
    public boolean arrInarr(int[] have,int[] needed){
        for(int i=0;i<have.length;i++){
            if(have[i]<needed[i]) return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int[] have = new int[256];
        int[] needed = new int[256];
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            needed[ch]++;
        }
        int low=0;
        String res="";
        int minLen=Integer.MAX_VALUE;
        for(int high=0;high<s.length();high++){
            have[s.charAt(high)]++;
            while(arrInarr(have,needed)){
                int len = high-low+1;
                if(len<minLen){
                    res = s.substring(low,high+1); 
                    minLen=len;
                }
                have[s.charAt(low)]--;
                low++;
            }
        }
        return res;
    }
}