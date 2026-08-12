class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long)m * k > bloomDay.length) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i = 0; i < bloomDay.length;i++){
           low = Math.min( low, bloomDay[i]);
           high = Math.max(high,bloomDay[i]);
        }
        while(low < high){
            int mid = low + (high - low)/2;
            int flower = 0;
            int bouquet = 0;
            for(int i = 0; i < bloomDay.length; i++){
                if(bloomDay[i] <= mid){
                    flower++;
                    if(flower == k){
                        bouquet++;
                        flower = 0;
                    }
                }
                else{
                    flower = 0;
                }

                
            }
                
            if(bouquet >= m){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
        
    }
}