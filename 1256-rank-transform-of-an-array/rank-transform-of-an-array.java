
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int[] sorted = arr.clone();   // copy of original array
        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        // Assign ranks
        for(int num : sorted){
            if(!map.containsKey(num)){
                map.put(num, rank);
                rank++;
            }
        }

        // Replace values with ranks
        for(int i = 0; i < arr.length; i++){
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}