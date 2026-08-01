class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] +nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            if(i!=0 && nums[i] == nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            
            while(j<k){
                int sum =(nums[i] + nums[j] +nums[k]);
                int tar = (target - sum);
                if(tar == 0){
                    return sum;
                }
                else if(sum <target){
                    j++;                   
                }else{
                    k--;
                }
                if(Math.abs(tar)<Math.abs(target -closest)){
                    closest = sum;
                }
            }
        }
        return closest;
    }
}