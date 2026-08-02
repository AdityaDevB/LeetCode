class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            int j=i+1;
            
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(j<nums.length-2){
                int k=j+1;
                int l=nums.length-1;
                if(j>i+1 && nums[j]==nums[j-1]){
                    j++;
                    continue;
                }
                while(k<l){
                    long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum == target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]){
                            k++;
                        }
                        while(k<l && nums[l] == nums[l+1]){
                            l--;
                        }
                    }else if(sum<target){
                        k++;
                    }else{
                        l--;
                    }
                }
                j++;
            }
        }
        return list;
    }
}