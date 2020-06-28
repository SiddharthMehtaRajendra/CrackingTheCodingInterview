package arrays;

public class ZeroMatrix {
	public void setZeroes(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] zeroes = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    zeroes[i][j] = true;
                }
            }
        }
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(zeroes[i][j]){
                    for(int k = 0; k < m; k++){
                        matrix[k][j] = 0;
                    }
                    for(int l = 0; l < n; l++){
                        matrix[i][l] = 0;
                    }
                }
            }
        }
    }
}
