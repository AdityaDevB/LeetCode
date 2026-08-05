class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] pos = new int[2];

        pos[0]=first(nums,target);
        pos[1]=last(nums,target);

        return pos;
    }
    private int first(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int num=-1;

        while(left<=right){
            int mid=left + (right-left)/2;
            if(nums[mid]==target){
                num = mid;
                right = mid-1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return num;
    }
    private int last(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        int num=-1;

        while(left<=right){
            int mid=left + (right-left)/2;
            if(nums[mid]==target){
                num = mid;
                left = mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return num;
    }
}