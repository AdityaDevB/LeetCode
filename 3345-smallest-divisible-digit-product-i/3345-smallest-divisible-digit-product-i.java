class Solution {
    public int smallestNumber(int n, int t) {
        int a=1;
        int b=n;
        
        do{
            while(b>0){
            a*=(b%10);
            b=b/10;
            }
            if(a%t!=0){
                a=1;
                n++;
                b=n;
            }
        }while(a%t!=0);
        return n;
    }
}