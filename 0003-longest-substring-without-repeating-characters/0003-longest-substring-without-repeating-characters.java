class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int low=0,res=0;
        for(int high=0;high<s.length();high++){
            char hCh =s.charAt(high);
            map.put(hCh,map.getOrDefault(hCh,0)+1);
            while(map.get(hCh)>1 && low<high){
                char lCh =s.charAt(low);
                map.put(lCh,map.get(lCh)-1);
                if(map.get(lCh)==0) map.remove(lCh);
                low++;
            } 
            if(map.get(hCh)==1) res = Math.max(res,high-low+1);
        }
        return res;
    }
}