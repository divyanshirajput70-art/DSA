class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int i = 0;
       
        int n = nums.length;
        for(int j = 0; j < n; j++){
            sum = sum + nums[j];
        

        
        while(sum >= target){
            //sum = sum+nums[j];
             min = Math.min(min, j - i + 1);
            
            sum = sum - nums[i];
           
            i++;
           // j=j+1;
        }
        }
        if(min == Integer.MAX_VALUE){
            return 0;
        }else{
            return min;
        }
        

        
    }
}