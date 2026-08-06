class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
        Arrays.sort(nums);
        if(nums[0]!=1){
            ans[1]=1;
        }
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                ans[0]=nums[i];
            }
            if(nums[i+1]>nums[i]+1){
                ans[1]=nums[i]+1;
            }
        }
        if(nums[nums.length-1]!=nums.length){
            ans[1]=nums.length;
        }
        
        return ans;
    }
}