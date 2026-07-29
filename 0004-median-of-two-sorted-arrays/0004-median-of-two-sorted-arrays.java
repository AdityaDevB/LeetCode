class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                merged[k++] = nums1[i++];
            }else{
                merged[k++] = nums2[j++];
            }
        }

        while(i<nums1.length){
            merged[k++]=nums1[i++];
        }

        while(j<nums2.length){
            merged[k++]=nums2[j++];
        }

        int len = merged.length;
        double median =0;
        if(len%2 == 0){
            int value = (len/2);
            median = (merged[value]+merged[value-1])/2.0;
        }else{
            int value = (len/2)+1;
            median = merged[value-1];
        }
        return median;
    }
}