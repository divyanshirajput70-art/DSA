class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] %2 == 0)
            even.add(nums[i]);
        
        else
            odd.add(nums[i]);
        }
        
        Collections.sort(even);
        Collections.sort(odd);

        int index = 0;
        for(int x : even)
        nums[index++] = x;

        for(int x : odd)
        nums[index++] = x;
        return nums;

        
    }
}