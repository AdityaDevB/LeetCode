class Solution {
    public void nextPermutation(int[] nums) {
        int flag =0;
        int i = nums.length-2;
        while(i>=0 && nums[i+1]<=nums[i]){
            i--;
        }
        int temp;
        if(i>=0){
            int j=nums.length-1;
            
            while(j>=0 && nums[j]<=nums[i]){
                j--;
            }       

            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;


        }
        i++;
        int j=nums.length-1;
        while(i<j){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }

    }
}