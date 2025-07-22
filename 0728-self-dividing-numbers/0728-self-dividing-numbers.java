class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(selfdiv(i)){
                l.add(i);
            }
        }
        return l;
    }

    public static boolean selfdiv(int num){
        int x=num;
        while(x>0){
            int r=x%10;
            x=x/10;
            if(r==0){
                return false;
            }
            if(num%r!=0){
                return false;
            }
        }
        return true;
    }
}