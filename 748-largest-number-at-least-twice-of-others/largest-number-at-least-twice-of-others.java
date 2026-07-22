class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int maxIndex = -1;
        int secondMax = -1;
        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                secondMax = max;
                max = nums[i];
                maxIndex = i;
            }
             else if(secondMax < nums[i]){
                secondMax = nums[i];
            
            
        }

        } 
        if(max >= 2*secondMax){
            return maxIndex;
        }
        
         return -1;
        
    }
}