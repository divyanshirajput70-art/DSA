class Solution {
    public int thirdMax(int[] nums) {
        // long first = Long.MIN_VALUE;
        // long second = Long.MIN_VALUE;
        // long third = Long.MIN_VALUE;
        // for(int i = 0; i<nums.length; i++){
        //      int num = nums[i];
        //     if(num == first || num == second || num == third){
        //         continue;
        //     }
           
        //     if(num > first){
        //         third = second;
        //         second = first;
        //         first = num;
        //     }
        //     else if(num > second){
        //         third = second;
        //         second = num;
        //     }
        //     else if(num > third){
        //         third = num;
        //     }
        // }
        // if(third == Long.MIN_VALUE){
        //     return (int)first;
        // }
        // return (int)third;
        Arrays.sort(nums);

        int count = 1;
        int prev = nums[nums.length - 1];

        for(int i = nums.length - 2; i >= 0; i--){

            if(nums[i] != prev){
                count++;
                prev = nums[i];
            }

            if(count == 3){
                return nums[i];
            }
        }

        return nums[nums.length - 1];
        
    }
}