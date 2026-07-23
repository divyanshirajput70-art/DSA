class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0;
       
        for(int fast = 0; fast < nums.length; fast++){
            if(nums[fast]!=0){
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;

            }
            
        }
        // int[] temp = new int[nums.length];
        // int index = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] != 0){
        //         temp[index] = nums[i];
        //         index++;
        //     }
        // }
        // for(int i = 0; i < nums.length; i++){
        //     nums[i] = temp[i];
        // }
        
    }
}