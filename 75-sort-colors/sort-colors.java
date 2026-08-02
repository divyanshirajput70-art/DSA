class Solution {
    public void sortColors(int[] nums) {
        // int zero = 0;
        // int one = 0;
        // int two = 0;
        // for(int num:nums){
        //     if(num == 0)
        //     zero++;
        //     else if(num ==1)
        //     one++;
        //     else
        //     two++;


            
        // }
        // int index = 0;
        // while(zero --> 0)
        //  nums[index++] = 0;
        //  while(one --> 0 )
        //  nums[index++] = 1;
        //  while(two --> 0)
        //  nums[index++] = 2;
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid <= high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }

        
        
    }
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}