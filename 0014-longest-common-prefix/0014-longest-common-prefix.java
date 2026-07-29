class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        
        String prefix = strs[0];
        String longest ="";
        for(int i =0 ; i<prefix.length() ; i++){
            String longe = prefix.substring(0,i+1);
            for(int j =0 ; j<strs.length;j++){
                if( (strs[j].length()) < i+1  || !longe.equals(strs[j].substring(0,i+1))){
                    return longest;
                }
            }
            longest = longe;
        }
        return longest;
    }
}