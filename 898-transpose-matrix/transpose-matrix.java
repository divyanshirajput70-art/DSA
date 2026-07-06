class Solution {
    public int[][] transpose(int[][] matrix) {
      int rows = matrix.length;
      int cols = matrix[0].length;
      int[][] ans = new int[cols][rows];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < cols;j++){
                ans[j][i] = matrix[i][j];
                //  int temp = matrix[i][j];
                //  matrix[i][j] = matrix[j][i];
                //  matrix[j][i] = temp;

            }
        }
        return(ans);
        
    }
}