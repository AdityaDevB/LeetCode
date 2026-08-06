class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list= new ArrayList<>();
        
        for(int i=1;i<=target[target.length-1];i++){
            
            Boolean isThere = false;
            list.add("Push");
            for(int j=0;j<target.length;j++){
                if(target[j]==i){
                    isThere =true;
                }
            }
            if(!(isThere)){
                list.add("Pop");
            }
        }
        return list;
    }
}