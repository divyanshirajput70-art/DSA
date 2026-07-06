class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            sum += mat[i][i];
           // for(int j = 0; j < arr[0].length;j--){
                sum += mat[i][mat.length - 1 - i];
                if(i == mat.length - 1 - i){
                    sum -= mat[i][i];
                }


            }
            return sum;
            
        }
        
    }
