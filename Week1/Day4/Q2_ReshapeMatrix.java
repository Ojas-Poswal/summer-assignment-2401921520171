package Week1.Day4;

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if(r*c < row*col || r*c > row*col) return mat;
        int k=0;
        int l=0;
        int [][]ans = new int[r][c];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               if(l==c) {
                k++;
                l=0;
               }
               ans[k][l] = mat[i][j];
               l++;
            }
        }
        return ans;
    }
}
