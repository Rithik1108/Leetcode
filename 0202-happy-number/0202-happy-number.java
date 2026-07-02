class Solution {
    public int sumSquare(int n){
        int res=0;
        while(n>0){
            int r = n%10;
            n=n/10;
            res = res+(r*r);
        }
        return res;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(fast!=1){
            slow=sumSquare(slow);
            fast=sumSquare(fast);
            fast=sumSquare(fast);
            if(slow==fast && slow!=1){
                slow=n;
                while(slow!=fast){
                    slow=sumSquare(slow);
                    fast=sumSquare(fast);
                }
                return false;
            }
        }
        return true;
    }
}