package Week1.Day4;

class Solution {
    public int diagonalSum(int[][] mat) {
        int primDiagonal = 0;
        int secDiagonal = 0;
        for(int i=0;i<mat.length;i++){
            primDiagonal += mat[i][i];
        }
        for(int i=0;i<mat.length;i++){
            if(mat.length-1-i == i) continue;
            secDiagonal += mat[i][mat.length-1-i];
        }
        return primDiagonal + secDiagonal;
    }
}