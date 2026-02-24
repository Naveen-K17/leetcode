class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n=x;
        int num=0;
        while(n>0){
            int d=n%10;
            num=num*10+d;
            n=n/10;
        }
        if(num==x){
            return true;
        }else{
            return false;
        }
    }
}