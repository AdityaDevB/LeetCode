class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int p=1;
        int a;
        int b=n;
        while(n>0){
            a=n%10;
            sum += a;
            p *= a;
            n=n/10;
        }
        if(b%(sum+p)==0){
            return true;
        }
        return false;
    }
}