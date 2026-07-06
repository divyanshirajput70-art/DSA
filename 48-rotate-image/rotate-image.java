class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
       // int[][] ans = new int[cols][rows];
        for(int i = 0; i < rows;i++){
            for(int j = 0; j < i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];matrix[j][i] = temp;
            }
        }
       // return ans;
       for(int i = 0;i <matrix.length;i++){
        int stCol = 0, endCol = matrix[0].length-1;
        while(stCol<endCol){
            int temp = matrix[i][stCol];
            matrix[i][stCol] = matrix[i][endCol];
            matrix[i][endCol] = temp;
            stCol++;
            endCol--;
        }
       }
        
    }
}