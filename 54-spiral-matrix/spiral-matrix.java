class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        int firstRow = 0;
        int lastRow = m - 1;
        int firstCol = 0;
        int lastCol = n - 1;

        while(firstRow <= lastRow && firstCol <= lastCol){

            // 1. Top row -> Left to Right
            for(int j = firstCol; j <= lastCol; j++){
                ans.add(arr[firstRow][j]);
            }
            firstRow++;


            // 2. Right column -> Top to Bottom
            for(int i = firstRow; i <= lastRow; i++){
                ans.add(arr[i][lastCol]);
            }
            lastCol--;


            // 3. Bottom row -> Right to Left
            if(firstRow <= lastRow){
                for(int j = lastCol; j >= firstCol; j--){
                    ans.add(arr[lastRow][j]);
                }
                lastRow--;
            }


            // 4. Left column -> Bottom to Top
            if(firstCol <= lastCol){
                for(int i = lastRow; i >= firstRow; i--){
                    ans.add(arr[i][firstCol]);
                }
                firstCol++;
            }
        }

        return ans;
    }
}