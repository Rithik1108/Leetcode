class Solution {
    public long sumAndMultiply(int n) {
        int res = 0;
        int sum = 0;
        int i=0;
        while(n>0){
            int r = n%10;
            n=n/10;
            if(r != 0){
                res = res + r*(int)Math.pow(10,i++);
                sum = sum + r;
            }
        }
        return (long)res*sum;
    }
}