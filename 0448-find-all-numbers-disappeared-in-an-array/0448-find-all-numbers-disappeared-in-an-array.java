class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list= new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=nums.length-1;i>=0;i--){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        return list;
    }
}